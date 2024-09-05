package com.exemplo.lab_banco_digital_oo;

/**
 * A classe ContaPoupanca representa uma conta poupança, derivada da classe Conta.
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
