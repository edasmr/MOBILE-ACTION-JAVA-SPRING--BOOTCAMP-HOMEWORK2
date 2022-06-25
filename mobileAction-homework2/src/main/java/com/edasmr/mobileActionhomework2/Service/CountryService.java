package com.edasmr.mobileActionhomework2.Service;

import com.edasmr.mobileActionhomework2.DAO.CountryDAO;
import com.edasmr.mobileActionhomework2.Entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryDAO countryDao;

    public List<Country> findAll(){

        return countryDao.findAll();
    }

    public Country save(Country country)
    {

        return countryDao.save(country);
    }


}
