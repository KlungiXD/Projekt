package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Trokut trokut1 = new Trokut("crvena", 4, 5);
        Pravokutnik pravokutnik1 = new Pravokutnik("zelena", 20, 13);

        System.out.println("Trokut");
        System.out.println("Površina: " + trokut1.getPovrsina() +  "  "  + trokut1.getBoja());

        System.out.println("Pravokutnik");
        System.out.println("Površina: " + pravokutnik1.getPovrsina() +  " Boja: " + pravokutnik1.getBoja());


        TorbaZaPlac kesica = new TorbaZaPlac("Plava", 2.6,  new BigDecimal("0.50"));
        TorbaZaPlazu velikaTorba = new TorbaZaPlazu("Žuta", 8.9, new BigDecimal("22.89"));

        System.out.println("Torba 1");
        System.out.println("Boja: " + kesica.getBoja() + ", Velicina: " + kesica.getVelicina() + " litara," + " Cijena : " + kesica.getCijena() + " eura");

        System.out.println("Torba 2");
        System.out.println("Boja: " + velikaTorba.getBoja() + ", Velicina: " + velikaTorba.getVelicina() + " litara," + " Cijena : " + velikaTorba.getCijena() + " eura");

        WebShopArtikl mojArtikl1 = new Trokut("crna", 2.10, 3.08);

        Trokut trokutIzArtikla = (Trokut)mojArtikl1;

    }
}