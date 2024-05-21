package edu.fatec.lp2.exercicio2.supermercado;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMax;
    private Supermercado supermercado;
}
