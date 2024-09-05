package com.exemplo.lab_banco_digital_oo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * A classe Banco representa uma instituição bancária que possui um nome e uma lista de contas associadas.
 */
@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

}
