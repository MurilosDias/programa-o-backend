package com.mycompany;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero = 1;

        while (numero != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: (0 para parar)");
            numero = scan.nextInt();

            // Usando um laço de repetição for para calcular e exibir a tabuada
            for (int i = 1; i <= 20; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
    }
}