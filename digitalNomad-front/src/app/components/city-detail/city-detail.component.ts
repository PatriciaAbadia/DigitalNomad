import { Component, OnInit } from '@angular/core';
import { City } from 'src/app/models/city.model';
import { UserEdgeService } from 'src/app/services/user-edge.service';

@Component({
  selector: 'app-city-detail',
  templateUrl: './city-detail.component.html',
  styleUrls: ['./city-detail.component.css']
})
export class CityDetailComponent implements OnInit {
  city: City;

  constructor(
    private userEdgeService : UserEdgeService
  ) { 
    this.city= new City('','','', 0,0,0,'','','','','','','','','','','','',0,0,'','');
  }
  

  ngOnInit(): void {
    this.userEdgeService.findByCity("Lisbon").subscribe(
      (city: City) => {
      this.city = city;
      console.log(city);
      } 
    );
  }

}
