package com.mycompany;

public class Aula05Repeticao {

    public static void main(String[] args) {
        /**
         * For (Para)
         *
         * Para cada elemento repita
         * 
         * 1º variável de iteração
         * 2º condição de parada
         * 3º incremento ou decremento
         */
        for(int i = 0;i <= 10; i=i +2) {
            System.out.println(i);

            // Decremento
            System.out.println("Contagem regressiva...");
            for (int i = 10; i >= 0; i--) {
                Thread.sleep(1000L);
                System.out.println(i + "...");
        }
        System.out.println("BOMM!!");
    }
