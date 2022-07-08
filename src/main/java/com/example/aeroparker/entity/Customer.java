package com.example.aeroparker.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name="Customer")
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(nullable = false, length = 50)
    private Date registration;
    @Column(nullable = false, length = 50)
    private  String email;
    @Column(nullable = false, length = 50)
    private String firstname;
    @Column(nullable = false, length = 50)
    private String lastname;
    @Column(nullable = false, length = 50)
    private String address1;
    @Column( length = 50)
    private String address2;
    @Column( length = 50)
    private String city;
    @Column(nullable = false, length = 10)
    private int postcode;
    @Column( length = 20)
    private int number;
    @OneToMany(
            mappedBy = "customer",
            cascade = CascadeType.ALL,
            orphanRemoval = true

    )
    private List<sites> site = new ArrayList<>();

    @OneToMany(
            mappedBy = "customerSite",
            cascade = CascadeType.ALL,
            orphanRemoval = true

    )
    private  List<customerSite> customerSiteList= new ArrayList<>();

}
