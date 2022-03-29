package com.company;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
            String userName,passWord,choice;
            String s1="Dilara";
            String s2="java";
            Scanner input=new Scanner(System.in);
            System.out.print("Kullanıcı adınız:");
            userName=input.nextLine();
            System.out.print("Şifreniz:");
            passWord=input.nextLine();

            if((userName.equals(s1))&&(passWord.equals(s2))) {
                System.out.println("Giriş yapıldı.");
            }
            else if((userName.equals(s1))&&(passWord!=s2)){
                System.out.println("Şifreniz hatalı.Yeni şifre oluşturmak ister misiniz\nEvet\nHayır");
                choice=input.nextLine();
                     if(choice.equals("Evet")){
                      System.out.print("Yeni şifreniz:");
                      passWord=input.nextLine();
                        if(passWord.equals(s2)){
                        System.out.println("Şifre oluşturulamadı.Tekrar deneyiniz.");
                    }   else
                        System.out.println("Yeni şifre oluşturuldu.");
                                }
            }else{
                System.out.println("Kullanıcı adınız ve şifreniz yanlış.Giriş yapılamıyor.");
            }

    }
}
