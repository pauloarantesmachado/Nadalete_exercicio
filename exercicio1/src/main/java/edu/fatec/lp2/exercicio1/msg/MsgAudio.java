package edu.fatec.lp2.exercicio1.msg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class MsgAudio extends Mensagem {
    private int duracao;

    @Override
    public Mensagem sendMessage() {
        return this;
    }
}
