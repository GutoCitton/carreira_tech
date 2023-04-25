package com.company.Aula1;

public class exc1 {
    public static void main (String[] args) {
        // parte 1
        String helloWorld = "Olá, mundo!";
        System.out.println(helloWorld);

        // parte 2
        int num1 = 5;
        int num2 = 7;

        int sumOfNumbers = num1 + num2;

        String sumDescription = "A soma dos dois números é: ";

        System.out.println(sumDescription + sumOfNumbers);

        // parte 3

        // Celcius
        float tempInCelc = 25f;
        String tempDescriptionCelc = "Temperatura em Celsius: ";

        // Fahrenheint
        String tempDescriptionFahren = "Temperatura em Fahrenheint: ";
        float tempInFahrenheint = ((tempInCelc * 9 / 5) + 32);

        // Kelvin
        String tempDescriptionKelvin = "Temperatura em Kelvin: ";
        double tempInKelvin = (tempInCelc + 273.15);


        System.out.println(tempDescriptionCelc + tempInCelc + "°C");
        System.out.println(tempDescriptionFahren + tempInFahrenheint + "°F");
        System.out.println(tempDescriptionKelvin + tempInKelvin + "K");

        // parte 4
        int rectangleHeight = 12;
        int rectangleWith = 10;

        int rectangleArea = rectangleHeight * rectangleWith;

        String areaDescription = "A área do retângulo é: ";

        System.out.println(areaDescription + rectangleArea);

        // parte 5
        String word = "Guto";

        for (int i=0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        // Esse eu só consegui pesquisando na internet, no JS é só usar split ai bati cabeça kkkk
    }
}
