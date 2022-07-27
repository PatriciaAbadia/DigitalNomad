import { Component, OnInit } from '@angular/core';
import { City } from 'src/app/models/city.model';
import { UserEdgeService } from 'src/app/services/user-edge.service';

@Component({
  selector: 'app-city-list',
  templateUrl: './city-list.component.html',
  styleUrls: ['./city-list.component.css']
})
export class CityListComponent implements OnInit {

  cities: City[];

  constructor(
    private userEdgeService : UserEdgeService

  ) { 
    this.cities=[];
  }
    
  ngOnInit(): void {
    this.userEdgeService.findAll().subscribe(
      (cities:City[]) => {
      this.cities = cities;
      console.log(this.cities);
      } 
    )
  }

  findByCostOfLifeLessThanAndSafetyIsAndInternetIs(costOfLife: number, safety: string, internet: string): City[] {
    return this.cities.filter(city => city.costOfLife < costOfLife && city.safety === safety && city.internet === internet);
// return cityDetailService.findByCostOfLifeLessThanAndSafetyIsAndInternetIs(costOfLife.get(), safety.get(), internet.get());
  } 

  findByContinent(continent: string): City[] {
    return this.cities.filter(city => city.continent === continent);
}
}