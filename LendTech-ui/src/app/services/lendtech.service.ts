import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type':'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class LendtechService {

  constructor(private http:HttpClient) { }
  getCustomerTransactions(id: number){
    return this.http.get('/server/api/v1/transactions/payments/'+id);
  }

  createCustomerTransaction(transaction){
    let body = JSON.stringify(transaction);
    return this.http.post('/server/api/v1/transactions', body , httpOptions);
  }
}


