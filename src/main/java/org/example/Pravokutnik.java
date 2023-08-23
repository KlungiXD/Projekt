package org.example;

import java.math.BigDecimal;

public class Pravokutnik extends GeometrijskiLik implements WebShopArtikl{
    private double stranicaA;
    private double stranicaB;


    public Pravokutnik(String boja, double stranicaA, double stranicaB){
        super(boja);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }
    public Pravokutnik(String boja, double stranicaA, double stranicaB, BigDecimal cijena){
        super(boja, cijena);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }


    public double getStranicaB() {
        return stranicaB;
    }

    public double getStranicaA() {
        return stranicaA;
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

    public String getBoja(){
        return super.getBoja();
    }

    @Override
    public String toString() {
        return " Stranica A: " + stranicaA + ", Stranica B: " + stranicaB + ", Cijena: " + getCijena() + " eur";
    }
}
