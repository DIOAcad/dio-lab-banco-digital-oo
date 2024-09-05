package com.exemplo.lab_banco_digital_oo;

/**
 * A classe ContaCorrente representa uma conta corrente, derivada da classe Conta.
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
