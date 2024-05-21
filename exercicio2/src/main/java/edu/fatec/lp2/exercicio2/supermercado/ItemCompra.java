package edu.fatec.lp2.exercicio2.supermercado;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemCompra  implements Calculavel{
    private int quantidade;
    private Produto produto;
    private double desconto;

    @Override
    public double calculaPreco() {
        return  this.quantidade*this.produto.getPreco();
    }
}
