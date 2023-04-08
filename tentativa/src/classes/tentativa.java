package classes;

import java.util.Scanner;

public class tentativa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /* Cria duas variaveis do String
         * A variável segredo recebe o dadao JAVA e a
         * variável palavraInformada vai receber o valor
         * informado pelo usuário*/
        String segredo = "JAVA", palavraInformada;
        /* Cria variavel cont para controlar a quantidade de erros do 
         * usuário. Essa variável também vai ser usada para controlar 
         * a quantodade de repetições*/
        int cont = 0;

        // Estrutura de repetição com teste no final
        do {
            // incrementando a variável cont
            cont++;
            /*Quando o valor atribuido a variável cont for
             * 5, imprime sua última tentativa*/
            if(cont == 5) {
                System.out.println("é sua ltima tentativa");
            }
            // Solicita que o usuario informa uma palavra
            System.out.println(cont + "a tentativa, digite a palavra");
            // Captura a palavra informada pelo usuario, coloca a palavra com letras maiusculas e atriui para a variavel palavraInformada
            palavraInformada = sc.next().toUpperCase();
            /* verifica se o conteúdo da variável segredo
             * é igual ao conteúdo da variável palavraInformada*/
            if(segredo.equals(palavraInformada)) {
                System.out.println("Você Acertou");
            } else {
                /* Imprime apenas se a variável palavraInformada
                 * for diferente da variável segredo*/
                System.out.println("Você errou");
                /*Quando o usuário erra a palavra, é apresentado
                para o usuário uma dica*/
                switch (cont) {
                    case 1:
                        System.out.println("DICA: palavra tem" + segredo + " letras");
                        break;
                    case 2:
                        System.out.println("É uma linguagem de programação");
                        break;
                    case 3:
                        System.out.println("tem letra'A' na palavra");
                        break;
                    case 4:
                        System.out.println("tem relação com café");
                        break;
                }
            }
            /* Condição que se o valor da variável segredo for diferente 
             * do valor da variável palavrainformada e
             * ao mesmo tempo, se a variável cont for menor que 5
             * o bloco da estrutura de repetições será executado novamente.*/
        } while(cont < 5 && segredo.equals(palavraInformada));
        sc.close();
        System.out.println("Jogo finalizado");
        
    }
}
