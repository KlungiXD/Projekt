package org.example;

import java.math.BigDecimal;

public class Trokut extends GeometrijskiLik implements WebShopArtikl{
    private double baza;
    private double visina;

    public Trokut(String boja, double baza, double visina, BigDecimal cijena){
        super(boja, cijena);
        this.baza = baza;
        this.visina = visina;
    }

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
        return super.getBoja();
    }

    @Override
    public String toString() {
            return "  Baza:" + baza + ", Visina: " + visina + ", Cijena: " + getCijena() + " eur";
    }
}
