package com.edasmr.mobileActionhomework2.Service;

import com.edasmr.mobileActionhomework2.Converter.AddressMapper;
import com.edasmr.mobileActionhomework2.DAO.AddressDAO;
import com.edasmr.mobileActionhomework2.DTO.AddressSaveRequestDTO;
import com.edasmr.mobileActionhomework2.Entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class IAddressService {
    private final AddressDAO addressDao;

    public AddressSaveRequestDTO save(AddressSaveRequestDTO addressSaveRequestDto){

        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveRequestDto);

        address = addressDao.save(address);

        AddressSaveRequestDTO addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }
//delete address to adressid
    public void delete(Long id){

        Address address = getById(id);

        addressDao.delete(address);
    }

    public AddressSaveRequestDTO findById(Long id){

        Address address = getById(id);

        AddressSaveRequestDTO addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    //find address to addresid
    public AddressDAO findAddress(Long id){

        return (AddressDAO) addressDao.findAddress(id);
    }

    // get adress to adress id
    private Address getById(Long id) {

        Optional<Address> addressOptional = addressDao.findById(id);

        Address address;
            address = addressOptional.get();
        return address;
    }
}
