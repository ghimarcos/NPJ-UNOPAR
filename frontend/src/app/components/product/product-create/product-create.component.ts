import { Component, OnInit } from '@angular/core';
import { ProductService } from './../product.service'
import { Router } from '@angular/router';
import { Product } from '../product.model';


@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  product : Product = {
    nome : "",
    rg : "",
    cpf :"",
    data_nasc : "",
    estado_civil :"",
    grau_escolar :"",
    telefone : "",
    email : "",
    documento : "",
    tipo : ""
}
  

  

  constructor( private productService : ProductService, 
    private router : Router
    ) { }

  ngOnInit(): void {
    
  }

createProduct(): void{
this.productService.create(this.product).subscribe(() => {
  this.productService.showOnConsole("Cliente criado!")
  this.router.navigate(['/products'])
})

  
}

cancel(): void{
  this.router.navigate(['/products'])
}




}
