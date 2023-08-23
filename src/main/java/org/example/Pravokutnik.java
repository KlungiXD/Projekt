package org.example;

import java.math.BigDecimal;

public class Pravokutnik extends GeometrijskiLik{
    private double stranicaA;
    private double stranicaB;

    public Pravokutnik(String boja, double stranicaA, double stranicaB){
        super(boja);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }
    @Override
    public double getPovrsina() {
        return stranicaB * stranicaB;
    }

    @Override
    public BigDecimal getCijena() {
        return super.getCijena();
    }

    @Override
    public boolean getRaspolozivost() {
        return super.getRaspolozivost();
    }

}
