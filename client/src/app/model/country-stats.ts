export class CountryStats {
    countryName: string;
    countryCode3: string;
    population: number;
    gdp: number;
    year: string;

    constructor(
        countryName: string,
        countryCode3: string,
        population: number,
        gdp: number,
        year: string,
    ) {
        this.countryName = countryName;
        this.countryCode3=countryCode3;
        this.population = population;
        this.gdp = gdp;
        this.year = year
    }
}
