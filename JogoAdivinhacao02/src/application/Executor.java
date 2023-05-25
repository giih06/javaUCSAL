package application;
import entities.Impressao;
import entities.JogoAdivinhacao;

public class Executor {
    // Executor
    public static void main(String[] args) throws Exception {
        String resposta = JogoAdivinhacao.palavraInformada().toUpperCase();
        Impressao.imprimir(JogoAdivinhacao.verificaAcerto(resposta));

    }

}
