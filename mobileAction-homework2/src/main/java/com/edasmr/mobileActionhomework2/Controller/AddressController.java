package com.edasmr.mobileActionhomework2.Controller;


import com.edasmr.mobileActionhomework2.DTO.AddressDTO;
import com.edasmr.mobileActionhomework2.DTO.AddressSaveRequestDTO;
import com.edasmr.mobileActionhomework2.Entity.*;
import com.edasmr.mobileActionhomework2.Service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddressController {


    //only use address service
    private final AddressService addressService;

    //save new adress
    @PostMapping("/country")
    public ResponseEntity save(@RequestBody Country country){

        country = addressService.saveCountry(country);

        return ResponseEntity.ok(country);
    }

    //Save new city

    @PostMapping("/city")
    public ResponseEntity save(@RequestBody City city){

        city = addressService.saveCity(city);

        return ResponseEntity.ok(city);
    }

    //save new district
    @PostMapping("/district")
    public ResponseEntity save(@RequestBody District district){

        district = addressService.saveDistrict(district);

        return ResponseEntity.ok(district);
    }

    //find city with given id
    @GetMapping("/district/{cityId}")
    public ResponseEntity findAllCityId(@PathVariable Long cityId){

        List<District> districtList = addressService.findAllByCityId(cityId);

        return ResponseEntity.ok(districtList);
    }

    //save new neighborhood
    @PostMapping("/neighborhood")
    public ResponseEntity save(@RequestBody Neighborhood neighborhood){

        neighborhood = addressService.saveNeighborhood(neighborhood);

        return ResponseEntity.ok(neighborhood);
    }

    // update neighborhood name
    @PatchMapping("/neighborhood/{id}")
    public ResponseEntity updateNeighborhoodName(@PathVariable Long id, @RequestParam String name){

        Neighborhood neighborhood = addressService.updateNeighborhoodName(id, name);

        return ResponseEntity.ok(neighborhood);
    }
// find neighborhood with given id
    @GetMapping("/neighborhood/{districtId}")
    public ResponseEntity findAllNeighborhoods(@PathVariable Long districtId){

        List<Neighborhood> neighborhoodList = addressService.findAllNeighborhoods(districtId);

        return ResponseEntity.ok(neighborhoodList);
    }

    // delete adress with given id
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        addressService.deleteAddress(id);

        return ResponseEntity.ok(Void.TYPE);
    }

    // find adress given id
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        AddressSaveRequestDTO addressResponseDto = addressService.findAddressById(id);

        return ResponseEntity.ok(addressResponseDto);
    }

    // save new street
    @PostMapping("/street")
    public ResponseEntity save(@RequestBody Street street){

        street = addressService.saveStreet(street);

        return ResponseEntity.ok(street);
    }

    // find street with given neigborhood id
    @GetMapping("/streets/{neighborhoodId}")
    public ResponseEntity findAllStreets(@PathVariable Long neighborhoodId){

        List<Street> streetList = addressService.findAllStreets(neighborhoodId);

        return ResponseEntity.ok(streetList);
    }
}
