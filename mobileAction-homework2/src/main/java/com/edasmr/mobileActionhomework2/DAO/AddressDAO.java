package com.edasmr.mobileActionhomework2.DAO;

import com.edasmr.mobileActionhomework2.DTO.AddressDTO;
import com.edasmr.mobileActionhomework2.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDAO  extends JpaRepository <Address, Long> {

    AddressDTO findAddress(@Param("id") Long id);
}
