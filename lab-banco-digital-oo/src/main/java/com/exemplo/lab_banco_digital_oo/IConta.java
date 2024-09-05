package com.exemplo.lab_banco_digital_oo;

/**
 * Interface que define as operações básicas de uma conta bancária.
 */
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}
