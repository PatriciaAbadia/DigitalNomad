import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { City } from '../models/city.model';
import { Weather } from '../models/weather.model';

@Injectable({
  providedIn: 'root'
})
export class UserEdgeService {
  private readonly API_URL: string = 'http://localhost:8080'
  constructor(
    private http: HttpClient
  ) { }

  findAll(): Observable<City[]> {
    return this.http.get<City[]>(this.API_URL+'/cities');
  }
  
  findByCity(city: string): Observable<City> {
    return this.http.get<City>(this.API_URL+'/cities/'+city);
  }

  findByCostOfLifeLessThanAndSafetyIsAndInternetIs(costOfLife: number, safety: string, internet: string): Observable<City[]> {
    return this.http.get<City[]>(this.API_URL+'/filtredCities?costOfLife='+costOfLife+'&safety='+safety+'&internet='+internet);
  }

  findWeatherByCity(city: string): Observable<Weather[]> { // llamar desde l detalle de city
    return this.http.get<Weather[]>(this.API_URL+'/weathers/cities/'+city);
  }

    
 
}
