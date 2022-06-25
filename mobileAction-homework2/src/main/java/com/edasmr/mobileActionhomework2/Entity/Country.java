package com.edasmr.mobileActionhomework2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(generator = "Country")
    @SequenceGenerator(name = "Country" , sequenceName = "COUNTRY_ID_SEQ")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;
}
