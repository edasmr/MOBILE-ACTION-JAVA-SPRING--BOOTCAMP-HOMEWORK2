package com.edasmr.mobileActionhomework2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
    public class Address {

        @Id
        @SequenceGenerator(name = "Address", sequenceName = "ADDRESS_ID_SEQ")
        @GeneratedValue(generator = "Address")
        private Long id;

        @Column(name = "COUNTRY_ID")
        private Long countryId;

        @Column(name = "CITY_ID")
        private Long cityId;

        @Column(name = "DISTRICT_ID")
        private Long districtId;

        @Column(name = "NEIGHBORHOOD_ID")
        private Long neighborhoodId;

        @Column(name = "STREET_ID")
        private Long streetId;

        @Column(name = "DOOR_NUMBER")
        private String doorNumber;

        @Column(name = "APARTMENT_NUMBER")
        private String apartmentNumber;
    }
