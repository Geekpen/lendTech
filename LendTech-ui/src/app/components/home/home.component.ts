import { Component, OnInit } from '@angular/core';
import { LendtechService } from '../../services/lendtech.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private lendtechService: LendtechService) { }

  ngOnInit(): void {
  }

}
