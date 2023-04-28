package com.company.Aula3;

import java.util.Scanner;

public class Aula3Exc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] alimentos = {"Feijão", "Arroz", "Carne", "Fruta"};
        String alimento = "";

        while (true) {
            System.out.print("Digite um alimento: ");
            alimento = input.nextLine();

            for (int i = 0; i < alimentos.length; i++) {
                // Se eu comparasse alimentos[i] == alimento, ele retorna false, pesquisando vi que é por conta da instância, encontrei o método equals() pesquisando e deu certo
                if(alimentos[i].equals(alimento)) {
                    System.out.println("O alimento, " + alimento + " está na lista de compras na posição " + i);
                    break;
                }
            }
        }
    }
}
