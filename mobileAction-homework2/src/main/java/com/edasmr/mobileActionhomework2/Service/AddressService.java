package com.edasmr.mobileActionhomework2.Service;

import com.edasmr.mobileActionhomework2.DTO.AddressDTO;
import com.edasmr.mobileActionhomework2.DTO.AddressSaveRequestDTO;
import com.edasmr.mobileActionhomework2.Entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AddressService {
    private final CountryService countryService;
    private final CityService cityService;
    private final DistrictService districtService;
    private final NeighBorhoodService neighborhoodService;
    private final StreetService streetService;
    private final IAddressService iaddressService;

    public Country saveCountry(Country country){
        return countryService.save(country);
    }


    public City saveCity(City city){

        return cityService.save(city);
    }


    public District saveDistrict(District district){

        return districtService.save(district);
    }

    public List<District> findAllByCityId(Long cityId){
        return
                districtService.findAllCityId(cityId);
    }

    public Neighborhood saveNeighborhood(Neighborhood neighborhood){
        return neighborhoodService.save(neighborhood);
    }

    public Neighborhood updateNeighborhoodName(Long id, String name){
        return neighborhoodService.updateNeighborhoodName(id, name);
    }

    public List<Neighborhood> findAllNeighborhoods(Long districtId){
        return neighborhoodService.findAllByDistrictId(districtId);
    }



    public void deleteAddress(Long id){
        iaddressService.delete(id);
    }

    public AddressSaveRequestDTO findAddressById(Long id){
        return
                iaddressService.findById(id);
    }

    public Street saveStreet(Street street){

        return streetService.save(street);
    }


    public List<Street> findAllStreets(Long neighborhoodId){
        return streetService.findAllNeighborhoodId(neighborhoodId);
    }
}
