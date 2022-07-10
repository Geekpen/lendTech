import { Component, OnInit } from '@angular/core';
import { LendtechService } from '../../services/lendtech.service';

@Component({
  selector: 'app-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.css']
})
export class WalletComponent implements OnInit {

  public transactions;

  constructor(private lendtechService: LendtechService) { }

  ngOnInit(): void {
    this.getTransactions();
  }

  getTransactions(){
    this.lendtechService.getTransactions().subscribe(
      data => {this.transactions = data},
      err => console.error(err)
      );
  }

}
