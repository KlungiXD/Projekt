package org.example;

import java.math.BigDecimal;

public abstract class GeometrijskiLik implements WebShopArtikl{
    private String boja;
    private BigDecimal cijena;

    public GeometrijskiLik(String boja, BigDecimal cijena){
        this.boja = boja;
        this.cijena = cijena;
    }

    public GeometrijskiLik(String boja){
        this.boja = boja;
    }
    public String getBoja() {
        return boja;
    }
    public BigDecimal getCijena() {
        return cijena;
    }
    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public abstract double getPovrsina();

    @Override
    public boolean getRaspolozivost() {
        return false;
    }
}
