import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../product.service';
import { Product } from '../product.model';
import { ShowOnDirtyErrorStateMatcher } from '@angular/material/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {

  product : Product = {
    nome : "",
    rg : "",
    cpf :"",
    estado_civil :"",
    grau_escolar :"",
    telefone : "",
    email : "",
    documento : "",
    tipo : "",
    data_nasc :""
}

    dataFormatada : string

  constructor(private productService: ProductService,
    private router: Router,
    private route: ActivatedRoute) { }



  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id')
    this.productService.readyById(id).subscribe(product => {
      this.product = product
    });
  }

  updateProduct(): void {
    this.productService.update(this.product).subscribe(() => {
      this.productService.showOnConsole("Cliente Atualizado com Sucesso!")
      this.router.navigate(['/products'])
    }
    )
  }

  cancel(): void {
    this.router.navigate(['/products'])

  }



}
