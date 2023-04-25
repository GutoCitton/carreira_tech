package com.company.Aula2;

import java.util.Scanner;

public class Aula2Exc4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();

        System.out.print("Digite sua idade: ");
        int age = input.nextInt();
        input.nextLine();

        // Pesquisando vi que a quebra de linha não é capturada pelo nextInt, o que fazia com que o campo cidade passasse automaticamente em branco, por isso desse nextLine() avulso.

        System.out.print("Digite sua cidade: ");
        String city = input.nextLine();

        System.out.print("Digite seu estado: ");
        String state = input.nextLine();

        System.out.println("Olá, seu nome é " + name + ", você tem " + age + " anos, é da cidade de " + city + ", situada no estado de " + state + ".");

    }
}
