import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() { }

  showOnConsole(msg : String): void {
    console.log(msg)
  }
}
