package ibf2022.ssf.day12workshop.service;

import java.util.List;

import ibf2022.ssf.day12workshop.model.Country;
import ibf2022.ssf.day12workshop.repository.CountryRepo;


public class CountryService {
    
    CountryRepo ctyRepo;

    // Without annotation, have to instantiate manually.
    public CountryService() {
        ctyRepo = new CountryRepo();
    }

    public List<Country> getAllCountries() {
        return ctyRepo.getAllCountries();
    }

    public Boolean createCountry(Country cty) {
        Boolean result = ctyRepo.createCountry(cty);
        return result;
    }
}
