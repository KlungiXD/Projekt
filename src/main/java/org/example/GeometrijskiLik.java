package org.example;

public abstract class GeometrijskiLik {

    public GeometrijskiLik(String boja){
        this.boja = boja;
    }
    public GeometrijskiLik(){}
    private String boja;

    public String getBoja() {
        return boja;
    }

    public abstract double getPovrsina();
}
