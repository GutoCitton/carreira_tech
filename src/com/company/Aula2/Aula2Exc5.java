package com.company.Aula2;

import java.util.Scanner;

public class Aula2Exc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = input.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num3 = input.nextInt();

        if(num1 < num2 && num1 < num3) {
            System.out.println("O primeiro número digitado é o menor!");
        } else if(num2 < num1 && num2 < num3) {
            System.out.println("O segundo número digitado é o menor!");
        } else if(num3 < num1 && num3 < num2) {
            System.out.println("O terceiro número digitado é o menor!");
        } else {
            System.out.println("Favor digitar números diferentes e válidos!");
        }
    }
}
