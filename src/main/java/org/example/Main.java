package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;

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

        ArrayList<GeometrijskiLik>listaLikova = new ArrayList<>();

        Pravokutnik pravokutnik2 = new Pravokutnik("žuta", 2.35, 5.68);
        Pravokutnik pravokutnik3 = new Pravokutnik("smeđa", 7.35, 9.68);
        Pravokutnik pravokutnik4 = new Pravokutnik("crna", 11.35, 14.68);


        Trokut trokut2 = new Trokut("roza", 2.35, 5.68);
        Trokut trokut3 = new Trokut("ljubičasta", 7.35, 9.68);
        Trokut trokut4 = new Trokut("crvena", 11.35, 14.68);


        listaLikova.add(pravokutnik2);
        listaLikova.add(pravokutnik3);
        listaLikova.add(pravokutnik4);

        listaLikova.add(trokut2);
        listaLikova.add(trokut3);
        listaLikova.add(trokut4);

        int i = 1;
        int j = 1;
        for (var GeometrijskiLikovi: listaLikova) {
            System.out.println("Boja " + i + ". lika:" + GeometrijskiLikovi.getBoja());
            i++;
        }

    }
}