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
  safetyIsSelected: boolean;
  internet: string;
  internetIsSelected: boolean;
  englishSpeaking: string;
  englishSpeakingSelected: boolean;
  walkability: string;
  walkabilitySelected: boolean;
  femaleFriendly: string;
  femaleFriendlySelected: boolean;
  fun: string;
  funSelected: boolean;
  nightlife: string;
  nightlifeSelected: boolean;
  nearBeach: string;
  nearBeachSelected: boolean;

  constructor(
    private userEdgeService : UserEdgeService

  ) { 
    this.cities=[];
    this.selectedCities=[];
    this.totalCities=0;
    this.continent="";
    this.safety = "good";
    this.internet = "good";
    this.englishSpeaking = "good";
    this.walkability = "good";
    this.femaleFriendly = "good";
    this.fun = "good";
    this.nightlife = "good";
    this.nearBeach = "good";
    

    this.internetIsSelected = false;
    this.safetyIsSelected = false;
    this.englishSpeakingSelected = false;
    this.walkabilitySelected = false;
    this.femaleFriendlySelected = false;
    this.funSelected = false;
    this.nightlifeSelected = false;
    this.nearBeachSelected = false;

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
  swapSafety(): void {
    this.safetyIsSelected = !this.safetyIsSelected;
    if (this.safetyIsSelected) {
      // this.internet = "good";
    } else {
      // this.internet = "bad";
    }
  }
  swapEnglishSpeaking(): void {
    this.englishSpeakingSelected = !this.englishSpeakingSelected;
    if (this.englishSpeakingSelected) {
      // this.internet = "good";
    } else {
      // this.internet = "bad";
    }
  }
  swapWalkability(): void {
    this.walkabilitySelected = !this.walkabilitySelected;
    if (this.walkabilitySelected) {
      // this.internet = "good";
    } else {
      // this.internet = "bad";
    }
  }
  swapFemaleFriendly(): void {
    this.femaleFriendlySelected = !this.femaleFriendlySelected;
    if (this.femaleFriendlySelected) {
      // this.internet = "good";
    } else {
      // this.internet = "bad";
    }
  }
  swapFun(): void {
    this.funSelected = !this.funSelected;
    if (this.funSelected) {
      // this.internet = "good";
    } else {
      // this.internet = "bad";
    }
  }
  swapNightlife(): void {
    this.nightlifeSelected = !this.nightlifeSelected;
    if (this.nightlifeSelected) {
      // this.internet = "good";
    } else {
      // this.internet = "bad";
    }
  }
  swapNearBeach(): void {
    this.nearBeachSelected = !this.nearBeachSelected;
    if (this.nearBeachSelected) {
      // this.internet = "good";
    } else {
      // this.internet = "bad";
    }
  }
  
}