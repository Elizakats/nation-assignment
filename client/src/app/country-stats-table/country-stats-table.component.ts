import { Component, OnInit } from '@angular/core';
import {CountryStats} from '../model/country-stats';
import { CountryServiceService } from '../service/country-service.service';

@Component({
  selector: 'app-country-stats-table',
  templateUrl: './country-stats-table.component.html',
  styleUrls: ['./country-stats-table.component.css']
})
export class CountryStatsTableComponent implements OnInit {

  countryStatsArray!: CountryStats[];

  constructor(private countryService: CountryServiceService) { }

  ngOnInit() {
    this.countryService.getCountryStats().subscribe(data =>{
      this.countryStatsArray=data;
    })

  }

}
