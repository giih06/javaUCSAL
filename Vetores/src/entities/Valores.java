package entities;
public class Valores {
    
    public static int[] sequencia() {
        int[] vetor = new int[5];
        for(int i=0, valor = 1; i < vetor.length; i++) {
            vetor[i] = valor;
        }
        return vetor;
    }

    public static int[] idades() {
        int[] idades = new int[5];
        idades[0] = 20;
        idades[2] = 29;
        idades[4] = 25;
        idades[1] = 22;
        idades[3] = 27;
        return idades;
    }
}
