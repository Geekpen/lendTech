import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { LendtechService } from './services/lendtech.service';
import { WalletComponent } from './components/wallet/wallet.component';
import { HomeComponent } from './components/home/home.component';
import { LoansComponent } from './components/loans/loans.component';

@NgModule({
  declarations: [
    AppComponent,
    WalletComponent,
    HomeComponent,
    LoansComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [LendtechService],
  bootstrap: [AppComponent]
})
export class AppModule { }
