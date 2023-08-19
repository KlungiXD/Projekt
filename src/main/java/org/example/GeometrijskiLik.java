package org.example;

public abstract class GeometrijskiLik {
    private String boja;
    public GeometrijskiLik(String boja){
        this.boja = boja;
    }
    public GeometrijskiLik(){}
    public String getBoja() {
        return boja;
    }

    public abstract double getPovrsina();
}
