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
      nome : 'Gabriel',
      email : 'gabriel123@gmail.com',
      senha : 'teste123',
     // data_nasc : new Date("2007-01-06")

  }

  constructor( private productService : ProductService, 
    private router : Router ) { }

  ngOnInit(): void {
    
  }

createProduct(): void{
this.productService.create(this.product).subscribe(() => {
  this.productService.showOnConsole("Produto criado!")
  this.router.navigate(['/products'])
})

  
}

cancel(): void{
  this.router.navigate(['/products'])
}

}
