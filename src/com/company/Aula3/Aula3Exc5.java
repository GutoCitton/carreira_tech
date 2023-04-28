package com.company.Aula3;

public class Aula3Exc5 {
    public static void main(String[] args) {
        double[][] values = {{1.0, 1.0, 1.0}, {2.5, 2.5, 2.5}, {3.7, 3.7, 3.7}};


        for (int i = 0; i < values.length; i++) {
            double sumColumns = 0;
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
                sumColumns += values[j][i];
            }
            System.out.println("A soma da coluna é" + ": " + sumColumns);
        }
    }
}
