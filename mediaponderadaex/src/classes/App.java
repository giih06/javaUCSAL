package classes;

import java.util.Scanner;

public class App {
    /*Elabore uma solução para que a partir de dois valores informados em um intervalo fechado de 0 a 10 e do tipo de média escolhida, seja apresentado o resultado da média calculada. Considere que o usuário poderá escolher entre uma média ponderada com pesos 4 e 6 respectivamente ou uma média aritmética. Considere também que os valores informados podem incluir decimais(double). Se um dos valores informados estiver fora do intervalo, a solução deverá apresentar "VALOR INFORMADO FORA DO INTERVALO VÁLIDO". Necessário usar as estruturas switch / case e if na solução */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // variáveis
        double valor1, valor2, media = 0;
        char opcao;
        // Constantes
        final double PESO1 = 4, PESO2 = 6, INICIO = 0, FIM = 10;
        System.out.println("Informe o primeiro valor:");
        valor1 = sc.nextDouble();
        System.out.println("Informe o segundo valor:");
        valor2 = sc.nextDouble();
        if (valor1 >= INICIO && valor1 <= FIM && valor2 >= INICIO && valor2 <= FIM) {

        System.out.println("Qual operação deseja fazer?"
        + "\n a) media ponderada"
        + "\n b) media aritmética"
        );
        opcao = sc.next().toLowerCase().charAt(0);
        switch (opcao) {
            case 'a':
                media = (valor1 * PESO1 + valor2 * PESO2) / PESO1 + PESO2;
                break;
            case 'b':
                media = (valor1 + valor2) / 2;
                break;
            default:
                break;
        }

        } else {
            System.out.println("VALOR INFORMADO FORA DO INTERVALO VÀLIDO");
        }
        System.out.println("A média é " + media);
        sc.close();
    }
}
