package com.edasmr.mobileActionhomework2.Service;

import com.edasmr.mobileActionhomework2.DAO.CityDAO;
import com.edasmr.mobileActionhomework2.Entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityDAO cityDao;

    public City save(City city){

        return cityDao.save(city);
    }
}
