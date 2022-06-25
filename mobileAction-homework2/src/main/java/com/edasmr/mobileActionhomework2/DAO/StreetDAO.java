package com.edasmr.mobileActionhomework2.DAO;

import com.edasmr.mobileActionhomework2.Entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StreetDAO extends JpaRepository<Street, Long> {

    List<Street> findAllNeighborhoodId(Long neighborhoodId);
}