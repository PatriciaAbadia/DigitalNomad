import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class HeaderComponent implements OnInit {
  
  username: string | null;
  constructor() { 
    this.username = '';
  }

  ngOnInit(): void {
    // localStorage.getItem("currentUser");
    this.username = JSON.parse(localStorage.getItem("currentUser") as string).username;
  }

}
