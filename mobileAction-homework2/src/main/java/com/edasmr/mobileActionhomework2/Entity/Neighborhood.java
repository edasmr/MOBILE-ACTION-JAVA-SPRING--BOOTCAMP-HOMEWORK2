package com.edasmr.mobileActionhomework2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "neighborhood")
@Getter
@Setter
public class Neighborhood {

    @Id
    @SequenceGenerator(name = "Neighborhood", sequenceName = "NEIGHBORHOOD_ID_SEQ")
    @GeneratedValue(generator = "Neighborhood")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DISTRICT_ID")
    private Long districtId;
}
