package org.example;

public class Main {
    public static void main(String[] args) {
        GeometrijskiLik lik1 = new GeometrijskiLik("plava");
        GeometrijskiLik lik2 = new GeometrijskiLik(1.1);
        GeometrijskiLik lik3 =  new GeometrijskiLik("crvena", 3.33);

        System.out.println("Prvi geometrijski lik:");
        System.out.println("Boja: " + lik1.getBoja() + "   " + "Povrsina: " + lik1.getPovrsina());

        System.out.println("Drugi geometrijski lik:");
        System.out.println("Boja: " + lik2.getBoja() + "   " + "Povrsina: " + lik2.getPovrsina());

        System.out.println("Treci geometrijski lik:");
        System.out.println("Boja: " + lik3.getBoja() + "   " + "Povrsina: " + lik3.getPovrsina());
    }
}