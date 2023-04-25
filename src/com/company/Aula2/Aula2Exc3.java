package com.company.Aula2;

import java.util.Scanner;

public class Aula2Exc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 1 a 7: ");
        int num = input.nextInt();

        switch (num){
            case 1:
                System.out.println("O número corresponde à segunda-feira");
                break;
            case 2:
                System.out.println("O número corresponde à terça-feira");
                break;
            case 3:
                System.out.println("O número corresponde à quarta-feira");
                break;
            case 4:
                System.out.println("O número corresponde à quinta-feira");
                break;
            case 5:
                System.out.println("O número corresponde à sexta-feira");
                break;
            case 6:
                System.out.println("O número corresponde à sábado");
                break;
            case 7:
                System.out.println("O número corresponde à domingo-feira");
                break;
            default:
                System.out.println("Por favor, digite um número válido!");
                break;
        }
    }
}

