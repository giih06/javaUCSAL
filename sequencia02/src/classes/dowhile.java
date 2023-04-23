package classes;

public class dowhile {
    public static void main(String[] args) throws Exception {
        /* Criando uma sequencia crescente de valores
         * do tipo int com estrutura de repetição com 
         * teste no início
         */
        int var = 0;
        while (var < 50){
            var++; // esse comando é a mesma coisa que var = var + 1;
            System.out.println(var + " ");
        }
        System.out.println(""); // quebra de linha
        /*criando uma sequencia crescente de valores
         * do tipo int com estrutura de repetição com
         * teste no final.
         */
        var = 0;
        do {
            var++;
            System.out.println(var + " ");
        } while (var < 50);

        /*do while =  repita enquanto for verdadeiro */
    }
}
