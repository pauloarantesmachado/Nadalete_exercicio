package edu.fatec.lp2.exercicio1.msg;

public abstract class  Mensagem {
    private String destinatario;
    private String horaEnvio;
    private String conteudo;


   public abstract Mensagem sendMessage();

    @Override
    public String toString() {
        return "Mensagem{" +
                "destinatario='" + destinatario + '\'' +
                ", horaEnvio='" + horaEnvio + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
