import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { City } from 'src/app/models/city.model';
import { Weather } from 'src/app/models/weather.model';
import { UserEdgeService } from 'src/app/services/user-edge.service';

@Component({
  selector: 'app-city-detail',
  templateUrl: './city-detail.component.html',
  styleUrls: ['./city-detail.component.css']
})
export class CityDetailComponent implements OnInit {
  city: City;
  cityName: string;

  weatherList: Weather[];

  constructor(
    private userEdgeService : UserEdgeService,
    private activatedRoute: ActivatedRoute
  ) { 
    this.city= new City('','','', 0,0,0,'','','','','','','','','','','','',0,0,'','');
    this.cityName = '';
    this.weatherList = [];
  }
  

  ngOnInit(): void {
    this.cityName = this.activatedRoute.snapshot.params['cityName'];
    this.userEdgeService.findByCity(this.cityName).subscribe(
      (city: City) => {
      this.city = city;
      console.log(city);
      } 
    );

    this.userEdgeService.findWeatherByCity(this.cityName).subscribe(
      (weatherList: Weather[]) => {
      this.weatherList = weatherList;
      console.log(weatherList);
      } 
    );
  }

}
