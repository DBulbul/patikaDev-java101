package com.company;
import java.util.Scanner;
public class ZodiacSign {

    public static void main(String[] args) {
        int month,day;

        Scanner input=new Scanner(System.in);
        System.out.print("Doğdunuğunuz ay:");
        month=input.nextInt();

        System.out.print("Doğduğunuz gün:");
        day=input.nextInt();

        if(month==1)
        {

            if(day>=1&&day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Kova");
                } else
                    System.out.println("Burcunuz Oğlak");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==2)
        {

            if(day>=1&&day<=29) {
                if (day <= 21) {
                    System.out.println("Burcunuz Kova");
                } else
                    System.out.println("Burcunuz Balık");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==3)
        {

            if(day>=1&&day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Balık");
                } else
                    System.out.println("Burcunuz Koç");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==4)
        {

            if(day>=1&&day<=30) {
                if (day <= 21) {
                    System.out.println("Burcunuz Koç");
                } else
                    System.out.println("Burcunuz Boğa");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==5)
        {

            if(day>=1&&day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Boğs");
                } else
                    System.out.println("Burcunuz İkizler");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==6)
        {

            if(day>=1&&day<=30) {
                if (day <= 21) {
                    System.out.println("Burcunuz İkizler");
                } else
                    System.out.println("Burcunuz Yengeç");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==7)
        {

            if(day>=1&&day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Yengeç");
                } else
                    System.out.println("Burcunuz Aslan");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==8)
        {

            if(day>=1&&day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Aslan");
                } else
                    System.out.println("Burcunuz Başak");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==9)
        {

            if(day>=1&&day<=30) {
                if (day <= 21) {
                    System.out.println("Burcunuz Başak");
                } else
                    System.out.println("Burcunuz Terazi");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==10)
        {

            if(day>=1&&day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Terazi");
                } else
                    System.out.println("Burcunuz Akrep");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==11)
        {

            if(day>=1&&day<=30) {
                if (day <= 21) {
                    System.out.println("Burcunuz Akrep");
                } else
                    System.out.println("Burcunuz Yay");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
        if(month==12)
        {

            if(day>=1&&day<=31) {
                if (day <= 21) {
                    System.out.println("Burcunuz Yay");
                } else
                    System.out.println("Burcunuz Oğlak");
            }
            else{
                System.out.println("Bilgileriniz yanlış");
            }
        }
    }
}
