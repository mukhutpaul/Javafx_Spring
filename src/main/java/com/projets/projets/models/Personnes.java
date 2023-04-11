package com.projets.projets.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Personnes {
    @Id
    @GeneratedValue
    private Integer id;
    private String noms;
    private String adress;

    public Personnes(String noms, String adress) {
        this.noms = noms;
        this.adress = adress;
    }
}
