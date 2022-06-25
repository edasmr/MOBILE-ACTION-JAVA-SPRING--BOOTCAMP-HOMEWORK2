package com.edasmr.mobileActionhomework2.DAO;

import com.edasmr.mobileActionhomework2.Entity.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NeighborhoodDAO extends JpaRepository<Neighborhood, Long> {

        List<Neighborhood> findAllDistrictId(Long districtId);
        }