package com.mycompany.poo.aula10.recuperacaoback;

public class App {
    public static void main(String[] args) {
    }
        public class Main {
    public static void main (String[] args) {
        ContBancaria conta1 = new ContBancaria(1, "João");
        ContBancaria conta2 = new ContBancaria(2, "Maria");}

        conta1.depositar(500);
        conta1.sacar(100);
        conta1.transferir(conta2, 200);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();

        conta1.mostrarExtrato();
        conta2.mostrarExtrato();

        if (!conta1.fecharConta()) {
            conta1.sacar(conta1.saldo);
            if (conta1.fecharConta()) {
                System.out.println("Conta 1 fechada com sucesso.");
    }
}
    
}