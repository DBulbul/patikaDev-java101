package com.company;
import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("KDVsiz Tutar:");
        int para=inp.nextInt();

        double Kdv=(para>1000)?(para*0.08):(para*0.18);

        System.out.println("KDV Tutarı:"+Kdv);

        double KDVliPara=para+Kdv;
        System.out.println("KDVli Tutar:"+ KDVliPara);
    }



}
