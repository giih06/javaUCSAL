package classes;

import java.util.Scanner;

public class intervalowhile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        /* Repetir o bloco sempre que o valor informado
         * está fora do intervalo fechado de 0 a 10
         */
        do {
            System.out.println("Usuário, informe 2 valores:");
            valor1 = sc.nextInt();
            valor2 = sc.nextInt();
        } while(valor1 < 0 || valor1 >10 || valor2 < 0 || valor2 >10); // entra nesssa estrutura de repetição apenas os valores fora do intervalo de 0 a 10
        System.out.println("FIM DA EXECUÇÂO");
        sc.close();

    }
}
