package org.example;

public class GeometrijskiLik {

    private String boja;
    private double povrsina;
    public GeometrijskiLik(String boja){
        this.boja = boja;
        povrsina = 0.0;
    }
    public GeometrijskiLik(double povrsina){
        boja = null;
        this.povrsina = povrsina;
    }
    public GeometrijskiLik(String boja, double povrsina){
        this.boja = boja;
        this.povrsina = povrsina;
    }
    public String getBoja() {
        return boja;
    }

    public double getPovrsina(){
        return povrsina;
    }
}
