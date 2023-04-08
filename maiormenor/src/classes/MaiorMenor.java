package classes;

import java.util.Scanner;

public class MaiorMenor {
    /* Problema: Elabore uma solução em JAVA para que, a partir de 03 valores 
 * inteiros e diferentes informados em um intervalo fechado de 0 a 10, seja
 *  definido qual é o maior e qual é o menor valor dos três informados.
 *  
 *  Caso algum valor informado esteja fora da regra definida, a execução
 *   será finalizada apresentando para o usuário "O VALOR INFORMADO NÃO 
 *   ATENDE A REGRA DEFINIDA"
 */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		System.out.println("Informe 3 valores");
		int valor1 = sc.nextInt(), valor2 = sc.nextInt(), valor3 = sc.nextInt();
		if (valor1 >= 0 && valor1 <= 10 && valor2 >= 0 && valor2 <= 10 && valor3 >= 0 && valor3 <= 10) {
			if (valor1 != valor2 && valor2 != valor3 && valor1 != valor2) {
				if (valor1 > valor2) {
						System.out.println("Maior: " + valor1);
						if (valor2 > valor3) {
							System.out.println("Menor: " + valor3);
						}else {
							System.out.println("Menor: " + valor2);
						}
				} else if (valor1 > valor3){
					System.out.println("Maior: " + valor1);
					if (valor2 > valor3) {
						System.out.println("Menor: " + valor3);
					}else {
						System.out.println("Menor: " + valor2);
					}
					
				} else if (valor2 > valor1){
					System.out.println("Maior: " + valor2);
					if (valor1 > valor3) {
						System.out.println("Menor: " + valor3);
					}else {
						System.out.println("Menor: " + valor1);
					}
				} else if (valor2 > valor3) {
					System.out.println("Maior: " + valor2);
					if (valor1 > valor3) {
						System.out.println("Menor: " + valor3);
					}else {
						System.out.println("Menor: " + valor1);
					}
				} else if (valor3 > valor1) {
					System.out.println("Maior: " + valor3);
					if (valor2 > valor1) {
						System.out.println("Menor: " + valor1);
					}else {
						System.out.println("Menor: " + valor2);
					}
					
				} else if (valor3 > valor2){
					System.out.println("Maior: " + valor3);
					if (valor2 > valor1) {
						System.out.println("Menor: " + valor1);
					}else {
						System.out.println("Menor: " + valor2);
					}
				}
				} else {
				System.out.println("O valor informado não atende a regra definida");
			}
			}else {
			System.out.println("Existe valor fora do intervalo de 0 a 10");
			}
            sc.close();
    }
}
