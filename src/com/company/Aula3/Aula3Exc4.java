package com.company.Aula3;

public class Aula3Exc4 {
    public static void main(String[] args){


        int[] num = {10, 20, 80, 40, 50};

        int num2 = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > num2)
                num2 = num[i];
        }

        System.out.println("O maior número do array é: " + num2);
    }
}
