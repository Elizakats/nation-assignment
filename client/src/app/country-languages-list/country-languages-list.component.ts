import { Component, OnInit } from '@angular/core';
import { Language } from '../model/language';
import { CountryServiceService } from '../service/country-service.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-country-languages-list',
  templateUrl: './country-languages-list.component.html',
  styleUrls: ['./country-languages-list.component.css']
})
export class CountryLanguagesListComponent implements OnInit {

  languages!: Language[];
  countryId!: number;

  constructor(private countryService: CountryServiceService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.countryId = params['country-id'];
      this.countryService.getLanguages(this.countryId).subscribe(data => {
        this.languages = data;
      })
    });


  }

  // ngOnInit() {
  //   this.route.queryParams.subscribe(params => {
  //     this.name = params['name'];
  //   });

  //   this.countryService.getLanguages().subscribe(data => {
  //     this.languages = data;
  //   });
  // }

}
