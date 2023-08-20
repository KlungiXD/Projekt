package org.example;

import java.math.BigDecimal;

public abstract class Torba {

    private double velicina; // izrazena  u litrama
    private String boja;
    private BigDecimal cijena;


    public Torba(String boja, double velicina, BigDecimal cijena){
        this.boja = boja;
        this.velicina = velicina;
        this.cijena = cijena;
    }
    public double getVelicina() {
        return velicina;
    }

    public String getBoja() {
        return boja;
    }

    public BigDecimal getCijena() {
        return cijena;
    }
}
