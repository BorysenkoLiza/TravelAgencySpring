package com.kpi.travelagency.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="cities")
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_country", nullable = false)
    private Country country;

    public City(Long id_city, String name, Country country) {
        this.id = id_city;
        this.name = name;
        this.country = country;
    }

    public City() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public void setId(Long id_city) {
        this.id = id_city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id_city=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
