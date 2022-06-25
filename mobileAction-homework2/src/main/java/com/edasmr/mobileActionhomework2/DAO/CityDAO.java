package com.edasmr.mobileActionhomework2.DAO;

import com.edasmr.mobileActionhomework2.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDAO extends JpaRepository<City, Long> {

    City findPlateCode(String plateCode);
}
