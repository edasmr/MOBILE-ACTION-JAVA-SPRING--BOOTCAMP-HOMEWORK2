package com.edasmr.mobileActionhomework2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "district")
@Getter
@Setter
public class District {

    @Id
    @SequenceGenerator(name = "District", sequenceName = "DISTRICT_ID_SEQ")
    @GeneratedValue(generator = "District")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CITY_ID")
    private Long cityId;
}
