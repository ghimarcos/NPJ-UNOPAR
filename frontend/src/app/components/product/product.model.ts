import { MatDateFormats } from '@angular/material/core';

export interface Product{
    id? : number
    nome : string
    email : string
    senha : string
    dataNasc : Date
}