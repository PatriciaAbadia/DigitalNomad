import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
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
