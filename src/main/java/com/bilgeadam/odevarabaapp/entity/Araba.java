package com.bilgeadam.odevarabaapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Araba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;
    private String ad;
    private long year;
    private String plate;
    private long bolumNo;





}
