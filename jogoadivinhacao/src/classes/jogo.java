import java.util.Scanner;

public class jogo {
    public static void main(String[] args) throws Exception {
        /* Faça um jogo
         * String segredo = "java" -> 5 tentativas
         * perdeu quando passou de 5
         */
        
         int contador = 0, valor;
         Scanner sc = new Scanner(System.in);

         do {
            contador++;
            System.out.println(contador + "a tentativa");
            System.out.println("Gamer, informe o valor");
            valor = sc.nextInt();
         } while (valor < 0 || valor > 10);
         System.out.println("Acertou");
         sc.close();
    }
}
