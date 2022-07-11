import { Component, OnInit } from '@angular/core';
import { LoansService } from '../../services/loans.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-loans',
  templateUrl: './loans.component.html',
  styleUrls: ['./loans.component.css']
})
export class LoansComponent implements OnInit {
  public transactions;
  constructor(private loanstechService: LoansService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.getTransactions(this.route.snapshot.params['id'], this.route.snapshot.params['fromDate'], this.route.snapshot.params['toDate']);
  }

 
  getTransactions(id:number, fromDate: string, toDate: string){
    this.loanstechService.getCustomerLoans(id,fromDate,toDate).subscribe(
      data => {this.transactions = data},
      err => console.error(err)
      );
  }

}
