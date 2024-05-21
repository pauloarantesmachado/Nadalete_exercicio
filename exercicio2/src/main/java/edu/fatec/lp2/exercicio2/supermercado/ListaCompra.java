package edu.fatec.lp2.exercicio2.supermercado;

import lombok.Getter;

import java.util.List;


@Getter
public class ListaCompra implements Calculavel{
    private List<ItemCompra> itensCompra;
    private int qTdMax;
    private int count =0;

    public ListaCompra(List<ItemCompra> itensCompra, int qTdMax) {
        this.itensCompra = itensCompra;
        this.qTdMax = qTdMax;
    }

    @Override
    public double calculaPreco() {
       return itensCompra.stream()
                .mapToDouble(item -> item.getProduto().getPreco() * item.getQuantidade())
                .sum();
    }

    public void incluir(ItemCompra item){
        if(this.count < this.qTdMax){
            this.count++;
            this.incluir(item);
            this.itensCompra.add(item);
        }
        
    }
}
