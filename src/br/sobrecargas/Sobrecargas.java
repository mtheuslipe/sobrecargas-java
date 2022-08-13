package br.sobrecargas;

import java.util.Scanner;

public class Sobrecargas {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double lado;
        double lado1, lado2;
        double base, Base, altura;
        System.out.println("digite um valor: ");
        lado= scan.nextInt();
        quadrilatero.area(lado);

        System.out.println("digite um valor: ");
        lado1= scan.nextInt();
        System.out.println("digite um valor: ");
        lado2= scan.nextInt();
        quadrilatero.area(lado1, lado2);

        System.out.println("digite um valor: ");
        base= scan.nextInt();

        System.out.println("digite um valor: ");
        Base= scan.nextInt();

        System.out.println("digite um valor: ");
        altura=scan.nextInt();
        quadrilatero.area(base, Base, altura);

    }
    public class quadrilatero {
        public static void area(double lado){
            System.out.println("A área do quadrado é: "+ (lado*lado));
        }
        public static void area(double lado1, double lado2){
            System.out.println("A área do quadrado é: "+ (lado1*lado2));
        }
        public static void area(double base, double Base, double altura){
            double soma =(base+Base)*altura;
            System.out.println("A área do quadrado é: "+ soma/2);
        }

    }

}
