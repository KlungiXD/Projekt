package org.example;

public class Pravokutnik extends GeometrijskiLik{
    double stranicaA;
    double stranicaB;

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
