package com.company;
import java.util.Scanner;


public class AlanBulanProgram {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını giriniz:");
        System.out.println("Birinci Kenar:");
        int birinciKenar=inp.nextInt();
        System.out.println("İkinci Kenar:");
        int ikinciKenar=inp.nextInt();
        System.out.println("Üçüncü Kenar:");
        int ucuncuKenar=inp.nextInt();

        double u=(birinciKenar+ikinciKenar+ucuncuKenar)/2;
        double kareAlan=u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar);
        double alan=Math.sqrt(kareAlan);
        System.out.println("Üçgenin alanı:"+alan);
    }
}
