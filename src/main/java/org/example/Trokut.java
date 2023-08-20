package org.example;

import java.math.BigDecimal;

public class Trokut extends GeometrijskiLik{
    private double baza;
    private double visina;

    public Trokut(String boja, double baza, double visina){
        super(boja);
        this.baza = baza;
        this.visina = visina;
    }
    @Override
    public double getPovrsina() {
        return baza * visina;
    }

    @Override
    public BigDecimal getCijena() {
        return super.getCijena();
    }

    @Override
    public boolean getRaspolozivost() {
        return super.getRaspolozivost();
    }

    @Override
    public String getBoja() {
        return "Boja trokuta je: " + super.getBoja();
    }
}
