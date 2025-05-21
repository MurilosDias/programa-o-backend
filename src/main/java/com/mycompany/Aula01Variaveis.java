package com.mycompany;

public class Aula01Variaveis {

  public static void main(String[] args) {
    // Variável lógica

    // Tipo primitívo
    boolean valorLogicoPrimitivo = true;

    // Exibe o valor
    System.out.println(valorLogicoPrimitivo);

    // Tipo abstrato
    boolean valorLogicoAbstrato = false;
    // Exibe com texto
    System.out.println("O valor a variavel valorLogicoAbstrato é: " + valorLogicoAbstrato);

    // Variáveis inteira

    // tipos primitivos
    int valorInteiro = 10; // 32 bits
    long valorInteiroLongo = 10l; // 64bits

    // Tipos abstrato
    Integer valorInteiroABs = 20;
    Long valorLongoABs = 20L;

    System.out.print("o valorInteiro é: " + valorInteiro + ", e o valor de valorinteiroLongo é:" + valorInteiroLongo);

    // Variáveis Decimais

    // tipos primitivos
    float numeroFloat = 10.5f; // 32 bits
    double numeroDouble = 10.5f; // 64 bits

    // Tipos abstrato
    float numeroFloatABs = 10.5f;
    double numeroDoubleABs = 10.5f;

    System.out.print("o numeroFloat é: " + numeroFloat + ", e o valor de numeroDouble é: " + numeroDouble);
  }
}
