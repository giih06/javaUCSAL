package application;

import entities.Valores;

public class Executor {
    public static void main(String[] args) throws Exception {
        int[] t = Valores.sequencia();

        // lenght pega a quantidade de elementos do vetor
        for(int i=0; i < t.length; i++){
            System.out.println(t[i]);
        }
    }
}
