import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WalletComponent } from './components/wallet/wallet.component';
import { HomeComponent } from './components/home/home.component';
import { LoansComponent } from './components/loans/loans.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'transactions/:id',
    component: WalletComponent
  },
  {
    path: 'loans/:id/:fromDate/:toDate',
    component: LoansComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
