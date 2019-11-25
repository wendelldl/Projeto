import { Component, OnInit } from '@angular/core';
import { ResponseCli } from '../services/responsecli';
import { Cliente } from '../services/cliente';
import { ActivatedRoute, Router } from '@angular/router';
import { ClienteService } from '../services/cliente.service';

@Component({
  selector: 'app-cadastro-cliente',
  templateUrl: './cadastro-cliente.component.html',
  styleUrls: ['./cadastro-cliente.component.scss']
})
export class CadastroClienteComponent implements OnInit {

  private titulo: string;
  private cliente: Cliente = new Cliente();

  constructor(private clienteService: ClienteService,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  /*CARREGADO NA INICIALIZAÇÃO DO COMPONENTE */
  ngOnInit() {

    this.activatedRoute.params.subscribe(parametro => {

      if (parametro["codigo_cliente"] == undefined) {

        this.titulo = "Novo Cadastro de Cliente";
      }
      else {

        this.titulo = "Editar Cadastro de Cliente";
        this.clienteService.getCliente(Number(parametro["codigo_cliente"])).subscribe(res => this.cliente = res);
      }


    });
  }

  /*FUNÇÃO PARA SALVAR UM NOVO REGISTRO OU ALTERAÇÃO EM UM REGISTRO EXISTENTE */
  salvar(): void {

    /*SE NÃO TIVER CÓDIGO VAMOS INSERIR UM NOVO REGISTRO */
    if (this.cliente.codigo_cliente == undefined) {

      /*CHAMA O SERVIÇO PARA ADICIONAR UMA NOVA PESSOA */
      this.clienteService.addCliente(this.cliente).subscribe(responsecli => {

        //PEGA O RESPONSE DO RETORNO DO SERVIÇO
        let res: ResponseCli = <ResponseCli>responsecli;

        /*SE RETORNOU 1 DEVEMOS MOSTRAR A MENSAGEM DE SUCESSO
        E LIMPAR O FORMULÁRIO PARA INSERIR UM NOVO REGISTRO*/
        if (res.codigo_cliente == 1) {
          alert(res.mensagem);
          this.cliente = new Cliente();
        }
        else {
          /*
          ESSA MENSAGEM VAI SER MOSTRADA CASO OCORRA ALGUMA EXCEPTION
          NO SERVIDOR (CODIGO = 0)*/
          alert(res.mensagem);
        }
      },
        (erro) => {
          /**AQUI VAMOS MOSTRAR OS ERROS NÃO TRATADOS
            EXEMPLO: SE APLICAÇÃO NÃO CONSEGUIR FAZER UMA REQUEST NA API                        */
          alert(erro);
        });

    }
    else {

      /*AQUI VAMOS ATUALIZAR AS INFORMAÇÕES DE UM REGISTRO EXISTENTE */
      this.clienteService.alterarCliente(this.cliente).subscribe(responsecli => {

        //PEGA O RESPONSE DO RETORNO DO SERVIÇO
        let res: ResponseCli = <ResponseCli>responsecli;

        /*SE RETORNOU 1 DEVEMOS MOSTRAR A MENSAGEM DE SUCESSO
          E REDIRECIONAR O USUÁRIO PARA A PÁGINA DE CONSULTA*/
        if (res.codigo_cliente == 1) {
          alert(res.mensagem);
          this.router.navigate(['/relatorio-cliente']);
        }
        else {
          /*ESSA MENSAGEM VAI SER MOSTRADA CASO OCORRA ALGUMA EXCEPTION
          NO SERVIDOR (CODIGO = 0)*/
          alert(res.mensagem);
        }
      },
        (erro) => {
          /**AQUI VAMOS MOSTRAR OS ERROS NÃO TRATADOS
           EXEMPLO: SE APLICAÇÃO NÃO CONSEGUIR FAZER UMA REQUEST NA API                        */
          alert(erro);
        });
    }

  }

}