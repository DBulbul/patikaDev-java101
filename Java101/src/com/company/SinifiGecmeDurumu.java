package com.company;
import java.util.Scanner;


public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;

        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat=input.nextInt();
        if(mat<0||mat>100){
            mat=0;
        }
        System.out.println("Fizik notunuzu giriniz:");
        fizik=input.nextInt();
        if(fizik<0||fizik>100){
            fizik=0;
        }
        System.out.println("Kimya notunuzu giriniz:");
        kimya=input.nextInt();
        if(kimya<0||kimya>100){
            kimya=0;
        }
        System.out.println("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();
        if(turkce<0||turkce>100){
            turkce=0;
        }
        System.out.println("Müzik notunuzu giriniz:");
        muzik=input.nextInt();
        if(muzik<0||muzik>100){
            muzik=0;
        }
        double ortalama=(mat+fizik+kimya+turkce+muzik)/5;
        System.out.println("Ortalamanız:"+ortalama);
        if (ortalama>55){
            System.out.println("Tebrikler.Sınıfı geçtiniz.");
        }else
            System.out.println("Sınıfı geçemediniz.");
    }
}
