package com.company.Aula4;

import java.util.Scanner;

public class Aula4Exc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = input.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = input.nextInt();

        int sum = add(num1, num2);

        System.out.print("A soma dos números é: " + sum);

    }

    public static int add (int value1, int value2) {

        return value1 + value2;
    }
}
