package com.company.Aula4;

public class Aula4Exc2 {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 10, 8, 2};
        double media = calcMedia(numbers);

        System.out.println("A media aritimética dos numeros é: " + media);
    }

    public static double calcMedia(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
