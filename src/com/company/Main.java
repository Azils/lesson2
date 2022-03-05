package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(dad(25 , 20));
        System.out.println(dad(13 , 23));
        System.out.println(dad(52 , 1));
        System.out.println(dad(12 , 32));
        System.out.println(dad(25 , 20));
    }
    public static String dad (int age , int temp) {
        String toy1 = "Можно идти гулять";
        String toy2 = "Оставайтесь дома ";
        if (age >= 20 && age <= 45 && temp >=-20 && temp <=30) {
            return toy1;
        }else if (age<20 && temp >=0 && temp <=28 ) {
            return toy1;
        }else {
            return toy2;
        }
    }
}
