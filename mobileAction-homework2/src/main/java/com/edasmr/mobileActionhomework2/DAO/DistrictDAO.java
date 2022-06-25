package com.edasmr.mobileActionhomework2.DAO;

import com.edasmr.mobileActionhomework2.Entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DistrictDAO extends JpaRepository<District, Long> {

    List<District> findAllCityId(Long cityId);
}