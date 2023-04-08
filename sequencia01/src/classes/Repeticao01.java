public class Repeticao01 {
    public static void main(String[] args) throws Exception {
        // Estrutura de Repetição com teste no início
         int num = 1;
        while (num <= 10) { // executa um bloco de instruções enquanto a condição num <= 10 for verdadeira (true).
            System.out.println(num + " ");
            num = num + 1;
        } 

        // faça uma sequencia de valores pares de 2 a 20 sem os numeros 8 e 16
        int par = 2;
        while (par <= 20) {
            if (par != 8 && par != 16) {
                System.out.println(par + " ");
            }
            par = par + 2;
        }

        // faça uma sequência de valores ímpares que não ultrapasse o valor 20.
        int impar = 1;
        while (impar <= 20) {
            System.out.println(impar + " ");
            impar = impar + 2;
        }

        // faça uma seqência de valores ímpares até 20 de trás para frente sem os valores 15,11 e 5.
        int contrario = 19;
        while (contrario > 0) {
            if (contrario != 15 && contrario != 11 && contrario != 5) {
                System.out.println(contrario + " ");
            }
            contrario = contrario - 2;
        }
        

    }
}
