package application;

import entities.Estrutura;
import entities.Imprimir;

public class Executor {
    public static void main(String[] args){
        int[] temp;
        String[] temp2;
       // Recebe o vetor vindo do método valores1 da classe Estrutura
       temp = Estrutura.valores1(5); 

       // Imprimir o vetor com todos os seus elementos
       Imprimir.imp(temp);

       temp = Estrutura.valores2(5);

       // Imprimir o vetor com todos os seus elementos
       Imprimir.imp(temp);

       // Vetor alunos
        // Recebe o vetor vindo do método alunos da classe Estrutura
       temp2 = Estrutura.alunos(5);


        // Imprimir o vetor com todos os seus elementos
       Imprimir.imp(temp2);
    }
}
