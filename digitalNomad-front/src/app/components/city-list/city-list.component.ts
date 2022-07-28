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
  selectedCities: City[];
  page:number = 1;
  totalCities: number;
  continent: string;
  costOfLife!: number;
  safety: string;
  internet: string
  internetIsSelected: boolean;

  constructor(
    private userEdgeService : UserEdgeService

  ) { 
    this.cities=[];
    this.selectedCities=[];
    this.totalCities=0;
    this.continent="";
    this.safety = "good";
    this.internet = "good";
    this.internetIsSelected = false;
  }
    
  ngOnInit(): void {
    this.userEdgeService.findAll().subscribe(
      (cities:City[]) => {
      this.cities = cities;
      this.selectedCities = this.cities;
      } 
    )
  }

  // findByCity(city: string): City {
  //   return this.cities.filter(city => city.city === city);
  // }

  findByCostOfLifeLessThanAndSafetyIsAndInternetIs(): void {
    console.log(this.costOfLife, this.safety, this.internet);
    this.userEdgeService.findByCostOfLifeLessThanAndSafetyIsAndInternetIs(this.costOfLife, this.safety, this.internet).subscribe(
      (cities: City[]) => {
        console.log(cities);
        this.selectedCities = cities;
      },
      (error) => {
        console.log(error);
      }

    );
    // this.selectedCities = this.cities.filter(city => city.costOfLife < costOfLife && city.safety === safety && city.internet === internet);
// return cityDetailService.findByCostOfLifeLessThanAndSafetyIsAndInternetIs(costOfLife.get(), safety.get(), internet.get());
  } 

  findByContinent(continent: string): void {
    this.selectedCities = this.cities.filter(city => city.continent === continent);
  }

  swapInternet(): void {
    this.internetIsSelected = !this.internetIsSelected;
    if (this.internetIsSelected) {
      // this.internet = "good";
    } else {
      // this.internet = "bad";
    }
  }
  
}