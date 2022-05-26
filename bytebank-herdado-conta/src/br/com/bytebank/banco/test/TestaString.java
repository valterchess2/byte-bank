package br.com.bytebank.banco.test;

import java.util.Locale;

public class TestaString {
    public static void main(String[] args) {
        String nome = "Alura "; // objeto literal
        nome = nome.trim(); // remove os espaços
//        nome = nome.replace("A", "a"); // string é imutável
//        nome = nome.toUpperCase(); // string é imutável
        char c = nome.charAt(2);
        System.out.println(c);
    }

}
