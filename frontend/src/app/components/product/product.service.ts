import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar'
import { Observable } from 'rxjs';
import { Product } from './product.model'

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  baseUrl = 'http://localhost:9100/usuario'


  constructor(private snackBar : MatSnackBar, private http : HttpClient) { }

  showOnConsole(msg : string): void {
    this.snackBar.open(msg,'Close',{
      duration: 3000,
      horizontalPosition: "right",
      verticalPosition: "top"
    })
  }

  create(user : Product): Observable <Product>{
    return this.http.post<Product>(this.baseUrl,user)
  }

}
