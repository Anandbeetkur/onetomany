package com.example.aeroparker.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="sites")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class sites {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 50)
    private  String name;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToMany(
            mappedBy = "sites_id",
            cascade = CascadeType.ALL
            //orphanRemoval = true

    )
    private customerSite cs;




}
