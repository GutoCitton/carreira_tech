package com.company.Aula4;

public class Aula4Exc4 {
    public static void main(String[] main) {
        String str = "abcdefg";

        if (contemApenasCaracteresAlfabeticos(str)) {
            System.out.println(str + " contem apenas caracteres alfabeticos");
        } else {
            System.out.println(str + " nao contem apenas caracteres alfabeticos");
        }
    }

    public static boolean contemApenasCaracteresAlfabeticos(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
