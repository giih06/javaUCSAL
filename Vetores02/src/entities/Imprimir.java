package entities;

public class Imprimir {
    public static void imp(int[] vetor) {
        for(int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void imp(String[] vetor) {
        for( int i=0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        System.out.println();
    }
}
