package ibf2022.ssf.day12workshop.repository;

import java.util.ArrayList;
import java.util.List;

import ibf2022.ssf.day12workshop.model.Country;

// Note that there is no annotation @Repository here.
public class CountryRepo {
    
    List<Country> countryList;

    public List<Country> getAllCountries() {

        countryList = new ArrayList<>();

        Country cty = new Country("SG", "Singapore", 6_000_000);
        countryList.add(cty);

        cty = new Country("MY", "Malaysia", 33_000_000);
        countryList.add(cty);

        cty = new Country("CN", "China", 1430_000_000);
        countryList.add(cty);

        cty = new Country("HK", "Hong Kong", 33_000_000);
        countryList.add(cty);

        return countryList;
    }

    public Boolean createCountry(Country cty) {

        if (countryList == null) {
            countryList = new ArrayList<>();
        }

        countryList.add(cty);
        return true;
    }
}
