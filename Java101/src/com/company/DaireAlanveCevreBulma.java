package com.company;
import java.util.Scanner;
public class DaireAlanveCevreBulma {
    public static void main(String[] args) {
        int r;
        double pi=3.14;

        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        r= input.nextInt();

        double alan=pi*r*r;
        double cevre=pi*2*r;
        System.out.println("Dairenin Alanı:"+alan);
        System.out.println("Dairenin Çevresi:"+cevre);

    }
}
