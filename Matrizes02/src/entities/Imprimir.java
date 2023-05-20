package entities;

public class Imprimir {
    public static void imp(double[][] mat) {
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                System.out.println(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void imp(String[][] mat) {
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                System.out.println(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

}
