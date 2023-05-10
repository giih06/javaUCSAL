package entities;
public class Valores {

    /* Método que retorna um vetor do tipo int preenchido com valores
     * que forma uma sequencia fibonacci com tamanho do vetor
     * definido pelo executor (uso de pâmetro) */
    public static int[] sequenciaFibonacci(int tam) {
        int[] vet = new int[tam];
        for(int i=0, a = 0, b = 1, aux; i < vet.length; i++) {
            vet[i] = a;
            aux = a + b;
            a = b;
            b = aux;
        }
        return vet;
    }
    
    /* Método que retorna um valor do tipo int preenchido com valores
     pares e tamanho do vetor definido pelo executor (uso do parametro) */
    public static int[] sequenciaPar(int tam) {
        int[] vetor = new int[tam];
        for(int i=0, var = 2; i < vetor.length; i++) {
            vetor[i] = var;
            var += 2;
        }
        return vetor;
    }

    /* Método que retorna um valor do tipo int com valores que forma uma
     * sequência de valores crescente e tamanho do vetor definido pelo executor */
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
