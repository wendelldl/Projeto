import { HomeComponent } from './home/home.component';
import { DistribuicaoClientesComponent } from './distribuicao-clientes/distribuicao-clientes.component';
import { RelatorioVendedoresComponent } from './relatorio-vendedores/relatorio-vendedores.component';
import { RelatorioClientesComponent } from './relatorio-clientes/relatorio-clientes.component';
import { CadastroVendedorComponent } from './cadastro-vendedor/cadastro-vendedor.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CadastroClienteComponent } from './cadastro-cliente/cadastro-cliente.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent },
  {path: 'cadastro-cliente', component: CadastroClienteComponent},
  {path: 'cadastro-cliente/:codigo_cliente', component: CadastroClienteComponent},
  {path: 'cadastro-vendedor', component: CadastroVendedorComponent},
  {path: 'relatorio-clientes', component: RelatorioClientesComponent},
  {path: 'relatorio-vendedores', component: RelatorioVendedoresComponent},
  {path: 'distribuicao-clientes', component: DistribuicaoClientesComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
