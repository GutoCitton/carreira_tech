package com.company.Aula4;

import java.util.Scanner;

public class Aula4Exc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;

        System.out.print("Digite um número: ");
        number = input.nextInt();


        if (isPrimeNumber(number)) {
            System.out.println(number + " É um número primo");
        } else {
            System.out.println(number + " não é um número primo");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    }

