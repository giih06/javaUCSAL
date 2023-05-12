package entities;

public class Somatorio {
    /* Retornar a soma de todos os elementos do vetor recebido */
    public static int somaVetor(int[] vet) {
        int soma = 0;
        for (int i=0; i < vet.length; i++) {
            soma += vet[i];
        }
        return soma;
    }
}
