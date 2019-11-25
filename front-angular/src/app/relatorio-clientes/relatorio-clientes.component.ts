import { Component, OnInit } from '@angular/core';
import { Cliente } from '../services/cliente';
import { ClienteService } from '../services/cliente.service';
import { Router } from '@angular/router';
import { ResponseCli } from '../services/responsecli';

@Component({
  selector: 'app-relatorio-clientes',
  templateUrl: './relatorio-clientes.component.html',
  styleUrls: ['./relatorio-clientes.component.scss']
})
export class RelatorioClientesComponent implements OnInit {
  
  private clientes: Cliente[] = new Array();
    private titulo:string;
 
    constructor(private clienteService: ClienteService,
                private router: Router){}
                
  ngOnInit() {

    /*SETA O TÍTULO */
    this.titulo = "Registros Cadastrados";
 
    /*CHAMA O SERVIÇO E RETORNA TODAS AS PESSOAS CADASTRADAS */
    this.clienteService.getClientes().subscribe(res => this.clientes = res);
  }

  /**EXCLUI UM REGISTRO QUANDO CLICAMOS NA OPÇÃO EXCLUIR DE UMA 
   * LINHA DA TABELA*/
  excluir(codigo_cliente:number, index:number):void {

    if(confirm("Deseja realmente excluir esse registro?")){

      /*CHAMA O SERVIÇO PARA REALIZAR A EXCLUSÃO */
      this.clienteService.excluirCliente(codigo_cliente).subscribe(responsecli => {

            /**PEGA O RESPONSE DO SERVIÇO */
            let res:ResponseCli = <ResponseCli>responsecli;

            /*1 = SUCESSO
            * MOSTRAMOS A MENSAGEM RETORNADA PELO SERVIÇO E DEPOIS REMOVEMOS
            O REGISTRO DA TABELA HTML*/
            if(res.codigo_cliente == 1){
              alert(res.mensagem);
              this.clientes.splice(index,1);
            }
            else{
              /*0 = EXCEPTION GERADA NO SERVIÇO JAVA */
              alert(res.mensagem);
            }
        },
        (erro) => {                    
             /*MOSTRA ERROS NÃO TRATADOS */
             alert(erro);
        });        
    }

  }

  alterar(codigo_cliente:number):void{

    this.router.navigate(['/cadastro-cliente',codigo_cliente]);

  }

}
    