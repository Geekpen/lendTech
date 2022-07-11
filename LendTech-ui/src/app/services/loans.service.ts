import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type':'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class LoansService {

  constructor(private http:HttpClient) { }
  getCustomerLoans(id: number, fromDate: string, toDate: string){
    return this.http.get('/server/api/v1/transactions/loans/'+id+'/'+fromDate+'/'+toDate);
  }

  createCustomerTransaction(transaction){
    let body = JSON.stringify(transaction);
    return this.http.post('/server/api/v1/transactions', body , httpOptions);
  }
}
