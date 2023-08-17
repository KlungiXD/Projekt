package org.example;

public class Main {
    public static void main(String[] args) {

        Trokut trokut1 = new Trokut("crvena", 4, 5);
        Pravokutnik pravokutnik1 = new Pravokutnik("zelena", 20, 13);

        System.out.println("Trokut");
        System.out.println("Površina: " + trokut1.getPovrsina() +  "  "  + trokut1.getBoja());

        System.out.println("Pravokutnik");
        System.out.println("Površina: " + pravokutnik1.getPovrsina() +  " Boja: " + pravokutnik1.getBoja());

    }
}