package entities;
public class Imprimir {
    public static void imp(int[][] temp) {
        for(int i=0; i<temp.length; i++) {
            for(int j=0; j<temp[i].length; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
}
