package com.edasmr.mobileActionhomework2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Getter
@Setter
public class City {

    @GeneratedValue(generator = "City")
    @SequenceGenerator(name = "City", sequenceName = "CITY_ID_SEQ")
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PLATE_CODE")
    private String plateCode;

    @Column(name = "COUNTRY_ID")
    private Long countryId;
}
