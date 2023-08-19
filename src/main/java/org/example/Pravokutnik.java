package org.example;

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
}
