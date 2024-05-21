package edu.fatec.lp2.exercicio1.msg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MsgTexto extends Mensagem{
        private int numChar;

        @Override
        public Mensagem sendMessage() {
                return this;
        }
}
