package entities;

public class Numeros {
    
    /* Retornar a quantidade de elementos pares no vetor */
    public static int quantidadePares(int vet[]) {
        int pares = 0;
        for(int i=0; i < vet.length; i++) {
            if(vet[i] % 2 == 0 && vet[i] != 0){
                pares++;
            }
        }
        return pares;
    }
}
