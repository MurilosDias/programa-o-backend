package com.mycompany;

import java.util.Scanner;

public class Aula05Repeticao {
    public static void main(String[] args) throws InterruptedException {
        /**
         * For (Para)
         * 
         * Para cada elemento repita
         * 
         * 1° variável de iteração
         * 2° condição de parada
         * 3° incremento ou decremento
         */
        // Incremento
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }

        // Decremento
        System.out.println("Contagem regressiva...");
        for (int i = 10; i >= 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");
        }
        System.out.println("Booom !!");

        /**
         * Classe Scanner
         * 
         * É utilizada para ler valores do usuario inseridas pelo prompt.
         */
        // Scanner scan = new Scanner(System.in); // Cria o scanner
        // System.out.println("Digite um número: ");

        // int numero = scan.nextlnt(_; // Lê o valor digitando e capturado pelo scanner
        // System.out.println("você digitou " + numero + "!!");

        int num1 = 1;

        while (num1 != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: (0 para parar)");
            num1 = scan.nextInt();
            System.out.println("Você digitou " + num1 + "!!");
        }

        System.out.println("Execução encerrada");

        /**
         * Do While (execute, enquanto)
         *
         * É executada uma estrutura de código e após é validada a condição
         */
        int num2;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: (0 para Sair)");
            num2 = scan.nextInt();
        } while (num2 != 0);

        System.out.println("Execução encerrada");
    }
}