package com.company;
import java.util.Scanner;

public class KucuktenBuyugeSıralama {
    public static void main(String[] args) {
        int numberOne,numberTwo,numberThree;
        Scanner input=new Scanner(System.in);
        System.out.print("Number one is:");
        numberOne=input.nextInt();
        System.out.print("Number two is:");
        numberTwo=input.nextInt();
        System.out.print("Number three is:");
        numberThree=input.nextInt();
        if((numberOne<numberTwo)&&(numberOne<numberThree)){
             if (numberTwo<numberThree) {
                 System.out.println("numberOne<numberTwo<numberThree");
             }else{
                 System.out.println("numberOne<numberThree<numberTwo");
                }
        }else if((numberTwo)<(numberOne)&&(numberTwo<numberThree)){
                if(numberOne<numberThree){
                    System.out.println("numberTwo<numberOne<numberThree");
                }else
                {
                    System.out.println("numberTwo<numberThree<numberOne");
                }
        }else if((numberThree)<(numberOne)&&(numberThree<numberTwo))
        {
            if(numberOne<numberTwo) {
                System.out.println("numberThree<numberOne<numberTwo");
            }else
            {
                System.out.println("numberThree<numberTwo<numberOne");
            }
        }

    }
}
