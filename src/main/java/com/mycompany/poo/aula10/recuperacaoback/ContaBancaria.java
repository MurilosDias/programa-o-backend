package com.mycompany.poo.aula10.recuperacaoback;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    int numero;
    String titular;
    double saldo = 0;
    List<String> extrato = new ArrayList()<>();

    ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        extrato.add("Conta criada");
    }

    boolean fecharConta() {
        if (saldo == 0) {
            extrato.add("Conta fechada");
            return true;
        }
        System.out.println("Saldo deve ser zero para fechar.");
        return false;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add("Depósito: " + valor);
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            extrato.add("Saque: " + valor);
        } else {
            System.out.println("Saque inválido.");
        }
    }

    void transferir(ContBancaria destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.saldo += valor;
            extrato.add("Transferido " + valor + " para conta " + destino.numero);
            destino.extrato.add("Recebido " + valor + " da conta " + numero);
        } else {
            System.out.println("Transferência inválida.");
        }
    }

    void mostrarSaldo() {
        System.out.println("Saldo da conta " + numero + ": " + saldo);
    }

    void mostrarExtrato() {
        System.out.println("Extrato da conta " + numero);
        for (String operacao : extrato) {
            System.out.println(operacao);
        }
    }
}
