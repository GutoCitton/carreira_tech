package com.company.Aula2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Aula2Exc6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Date date = new Date();
        int hour = Integer.parseInt(new SimpleDateFormat("HH").format(date));

        System.out.println(date);
        System.out.println(hour);


        if (hour >= 0 && hour < 7) {
            System.out.println("Boa Madrugada!");
        } else if(hour >= 7 && hour < 12) {
            System.out.println("Bom Dia!");
        } else if(hour >= 12 && hour < 19) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }
    }
}
