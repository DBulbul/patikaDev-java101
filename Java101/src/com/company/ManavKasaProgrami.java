package com.company;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;
        Scanner input=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        double armutKg=input.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        double elmaKg=input.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        double domatesKg=input.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        double muzKg=input.nextDouble();
        System.out.println("Patlican Kaç Kilo ? :");
        double patlicanKg=input.nextDouble();
        double toplam=armut*armutKg+elma*elmaKg+domatesKg*domates+muz*muzKg+patlicanKg*patlican;
        System.out.println("Toplam tutar :"+toplam);


    }
}
