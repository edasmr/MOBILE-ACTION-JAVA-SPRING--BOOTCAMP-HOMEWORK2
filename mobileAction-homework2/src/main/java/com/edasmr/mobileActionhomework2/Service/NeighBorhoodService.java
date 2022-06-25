package com.edasmr.mobileActionhomework2.Service;

import com.edasmr.mobileActionhomework2.DAO.NeighborhoodDAO;
import com.edasmr.mobileActionhomework2.Entity.Neighborhood;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class NeighBorhoodService {

    private final NeighborhoodDAO neighborhoodDao;

    public Neighborhood save(Neighborhood neighborhood)
    {
        return neighborhoodDao.save(neighborhood);
    }

    public Neighborhood updateNeighborhoodName(Long id, String name){
        Optional<Neighborhood> neighborhoodOptional = neighborhoodDao.findById(id);

        Neighborhood neighborhood;

            neighborhood = neighborhoodOptional.get();

        neighborhood.setName(name);

        return neighborhoodDao.save(neighborhood);
    }

    public List<Neighborhood> findAllByDistrictId(Long districtId){

        return neighborhoodDao.findAllDistrictId(districtId);
    }
}
