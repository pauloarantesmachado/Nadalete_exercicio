package edu.fatec.lp2.exercicio2.supermercado;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMax;
    private Supermercado supermercado;
    
    public Produto (String nome, String unidade, String descricao, double preco, double descontoMAx, Supermercado supermercado){
        this.nome = nome;
        this.unidade = unidade;
        this.descricao = descricao;
        this.preco = preco*(1-descontoMax);
        this.descontoMax = descontoMAx;
        this.supermercado = supermercado;
    }
}
