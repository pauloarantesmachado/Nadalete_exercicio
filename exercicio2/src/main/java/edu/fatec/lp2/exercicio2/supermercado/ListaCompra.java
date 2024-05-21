package edu.fatec.lp2.exercicio2.supermercado;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class ListaCompra implements Calculavel{
    private List<ItemCompra> itensCompra;
    private int qTdMax;


    @Override
    public double calculaPreco() {
       return itensCompra.stream()
                .mapToDouble(item -> item.getProduto().getPreco() * item.getQuantidade())
                .sum();
    }

    public void incluir(ItemCompra item){
        this.itensCompra.add(item);
    }
}
