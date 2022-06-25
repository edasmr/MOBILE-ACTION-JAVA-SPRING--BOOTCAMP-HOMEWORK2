package com.edasmr.mobileActionhomework2.Service;

import com.edasmr.mobileActionhomework2.DAO.StreetDAO;
import com.edasmr.mobileActionhomework2.Entity.Street;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreetService {

    private final StreetDAO streetDao;

    public Street save(Street street){
        return streetDao.save(street);
    }



    public List<Street> findAllNeighborhoodId(Long neighborhoodId){
        return streetDao.findAllNeighborhoodId(neighborhoodId);
    }
}

