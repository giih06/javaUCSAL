package application;

import entities.Somatorio;
import entities.Valores;

public class Executor {
    public static void main(String[] args) throws Exception {
        int quantidade = 20;
        /* Imprimir todos os elementos da sequencia Fibonacci
         * do método sequenciaFibonacci da classe
         * Sequencia
         */
        int[] t = Valores.sequenciaFibonacci(quantidade);

        // lenght pega a quantidade de elementos do vetor
        for(int i=0; i < t.length; i++){
            System.out.println(t[i]);
        }
        // Imprimir todos os valores da sequencia Fibonacci
        System.out.println("\n" + Somatorio.somaVetor(t));
    }
}
