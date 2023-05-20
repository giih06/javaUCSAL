package entities;

import java.util.Scanner;

public class Estrutura {

    public static String[][] caderneta(int qlinhas, int qcolunas) {
        int x;
        double soma;
        String[][] cad = new String[qlinhas][qcolunas];
        for(int i=0; i<cad.length; i++) {
            for(int j=0; i<cad[i].length; j++) {
                cad[1][1] = "Aluno";
                cad[1][2] = "un1";
                cad[1][3] = "un2";
                cad[2][1] = "AL1";
                cad[3][1] = "AL2";
                cad[4][1] = "AL3";
                cad[5][1] = "AL4"; 

            }
        }
        return cad;
    }

    public static double[][] notas(int qlinhas, int qcolunas) {
        int soma = 0, x;
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[qlinhas][qcolunas];
        for(int i=0; i<notas.length; i++) {
            for(int j=0; i<notas[i].length; j++) {
                if(j == 1 || j == 2) {
                    x = sc.nextDouble();
                }
                if(j == 3){
                    soma += cad[i][j];
                    System.out.println(soma);
                }
            }
        }
        return notas;
    }
}
