package application;

import entities.Estrutura;
import entities.Imprimir;

public class Executor {
    public static void main(String[] args) throws Exception {
        int[][] temp;
        /* Recebe o array bidimensional vindo do m[etodo valores1 da classe Estrutura */
        temp = Estrutura.valores1(3, 3);
        Imprimir.imp(temp);
        System.out.println("------------------");

        /* Crie um método para retornar uma array bidimensional do tipo int
        com valores ímapares. O tamanho do array deve vir no parâmetro do método */
        temp = Estrutura.valores2(9, 9);
        Imprimir.imp(temp);
    }
}
