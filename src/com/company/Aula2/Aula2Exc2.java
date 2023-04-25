package com.company.Aula2;

import java.util.Scanner;

public class Aula2Exc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("O número digitado é par!");
        } else {
            System.out.println("O número digitado é impar!");
        }
    }
}
