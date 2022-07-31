import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CountryListComponent } from './country-list/country-list.component';
import { CountryLanguagesListComponent } from './country-languages-list/country-languages-list.component';
import { CountryStatsTableComponent } from './country-stats-table/country-stats-table.component';

const routes: Routes = [
  {path: 'country-list', component: CountryListComponent},
  {path: 'country-list/:country-id/languages', component: CountryLanguagesListComponent},
  {path: 'country-stats', component: CountryStatsTableComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
