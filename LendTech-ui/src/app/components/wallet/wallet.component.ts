import { Component, OnInit } from '@angular/core';
import { LendtechService } from '../../services/lendtech.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.css']
})
export class WalletComponent implements OnInit {

  public transactions;

  constructor(private lendtechService: LendtechService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.getTransactions(this.route.snapshot.params['id']);
  }

 
  getTransactions(id:number){
    this.lendtechService.getCustomerTransactions(id).subscribe(
      data => {this.transactions = data},
      err => console.error(err)
      );
  }

}
