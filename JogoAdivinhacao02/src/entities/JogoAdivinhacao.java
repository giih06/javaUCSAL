package entities;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    // métodos do jogo adivinhação

    // a função dos vetores é pra guardar um mesmo tipo de dado 
    // métoso para retornar a palavra escondida
    /* Vamos definir algumas palebras, e o usuário (executor)
     * vai tentar adivinhar a palavra */
    public static String palavraEscondida() {
        Random rd = new Random();
        String[] palavras = {"Bacalhau", "Universidade", "Java", "Objeto", "Reforma", "Programação", "Nenhuma"};
        return palavras[rd.nextInt(palavras.length - 1)];
    }

    public static String palavraInformada() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Usuário, digite a palavra oculta: ");
            return sc.next();
        }
    }

    public static boolean verificaAcerto(String palavraUsuario) {
        boolean res;
        String var = JogoAdivinhacao.palavraEscondida();
        if(palavraUsuario.equals(var)) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }
}

