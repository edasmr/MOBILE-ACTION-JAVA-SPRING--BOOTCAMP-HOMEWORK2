package com.edasmr.mobileActionhomework2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "street")
@Getter
@Setter
public class Street {

    @Id
    @SequenceGenerator(name = "Street", sequenceName = "STREET_ID_SEQ")
    @GeneratedValue(generator = "Street")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NEIGHBORHOOD_ID")
    private Long neighborhoodId;
}
