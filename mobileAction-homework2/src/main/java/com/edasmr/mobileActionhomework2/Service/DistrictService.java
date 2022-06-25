package com.edasmr.mobileActionhomework2.Service;

import com.edasmr.mobileActionhomework2.DAO.DistrictDAO;
import com.edasmr.mobileActionhomework2.Entity.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DistrictService {

    private final DistrictDAO districtDao;

    public District save(District district){

        return districtDao.save(district);
    }

    public List<District> findAllCityId(Long cityId){

        return districtDao.findAllCityId(cityId);
    }
}
