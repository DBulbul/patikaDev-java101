package com.company;
import java.util.Scanner;

public class NotOrtalamasiHesapla {

    public static void main(String[] args) {
	// write your code here
        int fizik,kimya,mat,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.println("Turkce notunuzu giriniz:");
        turkce=input.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih=input.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya=input.nextInt();

        System.out.println("Muzik notunuzu giriniz:");
        muzik=input.nextInt();

        int ortalama=(fizik+mat+kimya+tarih+muzik+turkce)/6;
        System.out.println("Ortalamanız:"+ortalama);
        String str=(ortalama>60)?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(str);
    }
}
