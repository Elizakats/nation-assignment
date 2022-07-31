import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountryListComponent } from './country-list/country-list.component';
import { CountryLanguagesListComponent } from './country-languages-list/country-languages-list.component';

import { CountryServiceService } from './service/country-service.service';
import { CountryStatsTableComponent } from './country-stats-table/country-stats-table.component';


@NgModule({
  declarations: [
    AppComponent,
    CountryListComponent,
    CountryLanguagesListComponent,
    CountryStatsTableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CountryServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
