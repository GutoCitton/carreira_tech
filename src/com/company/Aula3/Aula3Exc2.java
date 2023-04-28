package com.company.Aula3;
import java.util.Scanner;

public class Aula3Exc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos itens sua lista de compras terá: ");
        int numItens = input.nextInt();

        String[] itensToBuy = new String[numItens];

        for (int i = 0; i < numItens; i++) {
            System.out.print("Digite um item da lista de compras: ");
            itensToBuy[i] = input.nextLine();

            if ( i == 0 ) {
              itensToBuy[i] = input.nextLine();
            }
        }

        for (int i = 0; i < numItens; i++) {
            System.out.println("Item " +  (i + 1) + " - " + itensToBuy[i]);
        }
    }
}

