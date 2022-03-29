package com.company;public class TaksimetreProgrami {
  public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz:");
        int KM=input.nextInt();
        int startPrice=10;
        double perKm=2.2;
        double odemeTaksi=(startPrice+perKm*KM);
        double taksimetre=(odemeTaksi<20)?20:odemeTaksi;
        System.out.println("Ödenecek tutar"+taksimetre);
    }
}


