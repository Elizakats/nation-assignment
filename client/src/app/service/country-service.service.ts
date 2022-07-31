import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Country } from '../model/country';
import { Language } from '../model/language';
import { CountryStats } from '../model/country-stats';
import { Observable } from 'rxjs';

@Injectable()
export class CountryServiceService {

  private countriesUrl: string;
  private countryLanguagesUrl: string;
  private countryStatsUrl: string;

  constructor(private http: HttpClient) {
    this.countriesUrl = 'http://localhost:8080/countries';
    this.countryLanguagesUrl = 'http://localhost:8080/countries/{id}/languages/';
    this.countryStatsUrl = 'http://localhost:8080/countries/stats';
  }

  public findAll(): Observable<Country[]> {
    return this.http.get<Country[]>(this.countriesUrl);
  }

  public getLanguages(id: number): Observable<Language[]> {
    return this.http.get<Language[]>(this.countryLanguagesUrl.replace("{id}", String(id)));
  }

  public getCountryStats(): Observable<CountryStats[]> {
    return this.http.get<CountryStats[]>(this.countryStatsUrl);
  }

}
