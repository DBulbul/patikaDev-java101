package com.company;
import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz:");
        int KM=input.nextInt();
        double odemeTaksi=(10+2.2*KM);
        double taksimetre=(odemeTaksi<20)?20:odemeTaksi;
        System.out.println("Ödenecek tutar"+taksimetre);
    }
}
