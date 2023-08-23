package org.example;

import java.math.BigDecimal;

public class TorbaZaPlazu extends Torba{
    public TorbaZaPlazu(String boja, double velicina, BigDecimal cijena) {
        super(boja, velicina, cijena);
    }

    @Override
    public String toString() {
        return " Velicina: " + getVelicina() + " litara, Cijena: " + getCijena() + " eur";
    }
}
