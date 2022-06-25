package com.edasmr.mobileActionhomework2.DTO;

import lombok.Data;

@Data
public class AddressSaveRequestDTO {

    private Long id;
    private Long countryId;
    private Long cityId;
    private Long districtId;
    private Long neighborhoodId;
    private Long streetId;
 //   private String doorNumber;
  //  private String apartmentNumber;
}
