package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de Acesso
     *
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso,
     * para dar segurança para nossas classes.
     *
     * Utilizamos elas como prefixo para:
     * - Classes
     * - Interfaces
     * - Atributos
     * - Métodos
     */
    public String nome; // Público, é visível em qualquer classe.
    protected int idade; // Protegido, é visível somente em classes filhas (Herança).
    private double salario; // Privado, é visível somente dentro da própria classe.
    double altura; // Friendly ou público, apesar de não estar explícito, ele ainda é visível.

}