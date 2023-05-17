package entities;

public class Estrutura {
    public static int[][] valores1 (int qlinhas, int qcolunas) {
        int[][] valores = new int[qlinhas][qcolunas];
        valores[1][1] = 18;
        valores[2][1] = 10;
        valores[2][0] = 1;
        valores[0][0] = 8;
        return valores;
    }

    public static int[][] valores2 (int qlinhas, int qcolunas) {
        int[][] valores = new int[qlinhas][qcolunas];
        int cont = 1;
        for(int i=0; i<valores.length; i++) {
            for(int j=0; j<valores[i].length; j++) {
                valores[i][j] = cont;
                cont += 2;
            }
        }
        return valores;
    }

    public static int[][] valores3(int qlinhas, int qcolunas) {
        int[][] valores = new int[qlinhas][qcolunas];
        for(int i=0,valor = 1; i<valores.length; i++) {
            for(int j=0; j<valores[i].length; j++, valor++) {
                if(valor % 4 == 0){
                    valores[i][j] = valor;
                }
            }
        }
        return valores;
    }
}
