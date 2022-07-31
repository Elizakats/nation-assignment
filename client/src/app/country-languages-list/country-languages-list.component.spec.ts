import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CountryLanguagesListComponent } from './country-languages-list.component';

describe('CountryLanguagesListComponent', () => {
  let component: CountryLanguagesListComponent;
  let fixture: ComponentFixture<CountryLanguagesListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CountryLanguagesListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CountryLanguagesListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
