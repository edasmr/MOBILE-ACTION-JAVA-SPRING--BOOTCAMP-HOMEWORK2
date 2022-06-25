package com.edasmr.mobileActionhomework2.Converter;

import com.edasmr.mobileActionhomework2.DTO.AddressSaveRequestDTO;
import com.edasmr.mobileActionhomework2.Entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressSaveRequestDTO addressSaveRequestDto);

    AddressSaveRequestDTO convertToAddressResponseDto(Address address);

}
