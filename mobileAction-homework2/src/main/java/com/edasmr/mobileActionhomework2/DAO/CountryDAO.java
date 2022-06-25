package com.edasmr.mobileActionhomework2.DAO;

import com.edasmr.mobileActionhomework2.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDAO  extends JpaRepository<Country, Long> {


}
