package com.company.Aula2;

import java.util.Scanner;

public class Aula2Exc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = input.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = input.nextInt();

        int result = num1 + num2;

        System.out.println("A soma dos números é: " + result);
    }
}
