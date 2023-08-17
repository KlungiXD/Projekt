package org.example;

public class GeometrijskiLik {

    GeometrijskiLik(String boja){
        this.boja = boja;
        povrsina = 0.0;
    }
    GeometrijskiLik(double povrsina){
        boja = null;
        this.povrsina = povrsina;
    }
    GeometrijskiLik(String boja, double povrsina){
        this.boja = boja;
        this.povrsina = povrsina;
    }
    private String boja;
    private double povrsina;

    public String getBoja() {
        return boja;
    }

    public double getPovrsina(){
        return povrsina;
    }
}
