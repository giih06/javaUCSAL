package application;

import entities.Impressao;
import entities.Sequencia;

public class Executor {
    public static void main(String[] args) throws Exception {   
        int tam = 30, metade = tam/2, limite = 100, resultado;
        resultado = Sequencia.progressaoAritmetica(limite);
        Impressao.impressao("Resultado PA -> " + resultado);      
        
        resultado = Sequencia.fibonacci(tam);
        Impressao.impressao("Resultado Fib -> " + resultado);

        resultado = Sequencia.progressaoGeometrica(metade);
        Impressao.impressao("Resultado PG -> " + resultado);
    }
}
