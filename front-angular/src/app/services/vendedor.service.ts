import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Headers} from '@angular/http';
import { RequestOptions } from '@angular/http';
 
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';
 
import {Vendedor} from '../services/vendedor';
import { ConfigService } from '../services//config.service';
 
@Injectable()
export class VendedorService {
 
    private baseUrlService:string = '';
    private headers:Headers;
    private options:RequestOptions;
 
    constructor(private http: Http,
                private configService: ConfigService) { 
 
        /**SETANDO A URL DO SERVIÇO REST QUE VAI SER ACESSADO */
        this.baseUrlService = configService.getUrlService() + '/cliente/';
 
        /*ADICIONANDO O JSON NO HEADER */
        this.headers = new Headers({ 'Content-Type': 'application/json;charset=UTF-8' });                
        this.options = new RequestOptions({ headers: this.headers });
    }

    /**CONSULTA TODAS AS PESSOAS CADASTRADAS */
    getVendedores(){        
        return this.http.get(this.baseUrlService).map(res => res.json());
    }
 
    /**ADICIONA UMA NOVA PESSOA */
    addVendedor(vendedor: Vendedor){
 
        return this.http.post(this.baseUrlService, JSON.stringify(vendedor),this.options)
        .map(res => res.json());
    }
    /**EXCLUI UMA PESSOA */
    excluirVendedor(codigo_vendedor:number){
 
        return this.http.delete(this.baseUrlService + codigo_vendedor).map(res => res.json());
    }
 
    /**CONSULTA UMA PESSOA PELO CÓDIGO */
    getVendedor(codigo_vendedor:number){
 
        return this.http.get(this.baseUrlService + codigo_vendedor).map(res => res.json());
    }
 
    /**ATUALIZA INFORMAÇÕES DA PESSOA */
    alterarVendedor(vendedor:Vendedor){
 
        return this.http.put(this.baseUrlService, JSON.stringify(vendedor),this.options)
        .map(res => res.json());
    }
 
}