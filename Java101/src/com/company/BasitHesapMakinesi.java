package com.company;
import java.util.Scanner;
public class BasitHesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,choice;
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        n1= input.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        n2=input.nextInt();
        System.out.println("Yapılacak işlemi seçin:\n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.println("Seçiminiz:");
        choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Sonuç:"+(n1+n2));
            break;
            case 2:
                System.out.println("Sonuç:"+(n1-n2));
            break;
            case 3:
                System.out.println("Sonuç:"+(n1*n2));
            break;
            case 4:
                if(n2!=0)
                    System.out.println("Sonuç:"+(n1/n2));
                else
                    System.out.println("Bölünen sayı sıfır olamaz");
            break;
            default:
                System.out.println("Yanlış seçim yaptınız.");

        }

    }
}
