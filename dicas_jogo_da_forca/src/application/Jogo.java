package application;

import java.util.Random;

public class Jogo {
    
    public static void main(String[] args) {
        String palavra = "Fernando";
        System.out.println(palavra.substring(0, 3));;
    }

    public static String palavraOculta() {
        Random rd = new Random();
        String[] v = {"bola", "giovanna", "linda"};
        return v[rd.nextInt(v.length)]; 
    }

    public static void verificaLetraNaPalavra(String palavra, String letra) {
        for(int i=0; i < palavra.length(); i++) {
            if (palavra.substring(i, i+1).equals(letra)) {
                System.out.println(palavra.substring(i, i+1));
            }
        }
    }
}
