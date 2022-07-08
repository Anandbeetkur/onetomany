package com.example.aeroparker.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class customerSite {

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customersi;

@ManyToOne
@JoinColumn(name = "sites_id")
private sites sites;
}
