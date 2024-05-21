package edu.fatec.lp2.exercicio1.app;

import edu.fatec.lp2.exercicio1.contato.Contatinho;
import edu.fatec.lp2.exercicio1.msg.Mensagem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;


    public void listarContatos(){
        this.contatos.forEach(System.out::println);
    }

    public void listarMensagens(){
        this.mensagens.forEach(System.out::println);
    }
}
