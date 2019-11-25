import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';
import { HttpModule } from '@angular/http'; 
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app.routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { CadastroClienteComponent } from './cadastro-cliente/cadastro-cliente.component';
import { CadastroVendedorComponent } from './cadastro-vendedor/cadastro-vendedor.component';
import { RelatorioClientesComponent } from './relatorio-clientes/relatorio-clientes.component';
import { RelatorioVendedoresComponent } from './relatorio-vendedores/relatorio-vendedores.component';
import { DistribuicaoClientesComponent } from './distribuicao-clientes/distribuicao-clientes.component';
import { HomeComponent } from './home/home.component';
import { MenuComponent } from './menu/menu.component'
 
@NgModule({
  declarations: [
    AppComponent,
    CadastroClienteComponent,
    CadastroVendedorComponent,
    RelatorioClientesComponent,
    RelatorioVendedoresComponent,
    DistribuicaoClientesComponent,
    HomeComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    HttpModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
