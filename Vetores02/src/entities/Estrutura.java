package entities;

public class Estrutura {
    public static int[] valores2(int tam) {
        int[] valores = new int[tam];
        for(int i=0; i<valores.length; i++) {
            valores[i] = i + 1;
        }
        return valores;
    }

    public static int[] valores1(int tam) {
        int[] valores = new int[tam];
        valores[4] = 63;
        valores[0] = 12;
        valores[3] = 58;
        valores[1] = 28;
        valores[2] = 31;
        return valores;
    }

    public static String[] alunos(int tam) {
        String[] valores = new String[tam];
        for(int i=0; i<valores.length; i++) {
            valores[i] = "Aluno" + (i + 1);
        }
        return valores;
    }
}
