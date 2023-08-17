package org.example;

public abstract class GeometrijskiLik {

    GeometrijskiLik(String boja){
        this.boja = boja;
    }
    GeometrijskiLik(){}
    private String boja;

    public String getBoja() {
        return boja;
    }

    public abstract double getPovrsina();
}
