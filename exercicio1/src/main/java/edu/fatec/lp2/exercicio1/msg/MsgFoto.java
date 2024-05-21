package edu.fatec.lp2.exercicio1.msg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MsgFoto  extends Mensagem{
    private int tamanho;

    @Override
    public Mensagem sendMessage() {
        return this;
    }
}
