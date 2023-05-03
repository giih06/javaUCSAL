package entities;

public class Sequencia {

    // método 1
    public static int fibonacci(int quantidadeDeElementos){
        int soma = 0, ant = 0, prox = 1, aux;
        for(int contador = 0; contador < quantidadeDeElementos; contador++){
            soma += ant;
            aux = ant + prox;
            ant = prox;
            prox = aux;
        }
        return soma;
    }

    // método 2
    public static int progressaoAritmetica(int limite){
        // valor inicial 5, razão 13, menor igual a 100;
        final int RZ = 13;
        int soma = 0, ti = 5;
        while(ti <= limite){
            soma += ti;
            ti += RZ;
        }
        return soma;

    }

    // método 3
    // PG cujo termo inicial 3, razão 2 e sequencia menor igual a 50;
    public static int progressaoGeometrica(int tam){
        int cont = 0, soma = 0, ti = 3, razao = 2;
        while(cont < tam){
            soma += ti;
            ti *= razao;
            cont++;
        }
        return soma;
    }
}