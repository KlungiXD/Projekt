package org.example;

public class Trokut extends GeometrijskiLik{
    double baza;
    double visina;

    Trokut(String boja, double baza, double visina){
        super(boja);
        this.baza = baza;
        this.visina = visina;
    }
    @Override
    public double getPovrsina() {
        return baza*visina;
    }

    @Override
    public String getBoja() {
        return "Boja trokuta je: " + super.getBoja();
    }
}
