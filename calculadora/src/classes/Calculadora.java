package classes;

import java.util.Scanner;
/* os valores informados devem estar no intervalo fechado
 * de 1 a 10, se não tiver, imprima o valor FORA DO
 * INTERVALO 
 */
public class Calculadora {
    public static void main(String[] args) throws Exception {
        // Obtendo dados do console
		Scanner sc = new Scanner(System.in);
		
		// Constantes
		final double INICIO = 0, FIM = 10; // o nome de constantes devem ser com letras maiúsculas
		/* O que é o final em Java?
        A palavra-chave final em Java serve para atribui5r valores constantes, ou seja, que a partir 
		da sua declaração, seus valores não poderão mais serem alterados. */
		
		// Variaveis (letras minúsculas)
		double valor1, valor2, resultado = 0; // double é um número real
		String txt = null; // O valor NULL serve para indicar que o valor da coluna ou da expressão não foi informado, pois significa ausência de valor
		boolean valida = true; // atribui o valor true para a variavel 'valida'
		char opcao; 
		int resposta;
		
		// Obtendo dados do usuario
		System.out.println("Informe o valor 1");
		valor1 = sc.nextDouble(); // captura o valor do usuário
		System.out.println("Informe o valor 2");
		valor2 = sc.nextDouble();
		
		// Validando os valores informados
		if (valor1 >= INICIO && valor1 <= FIM && valor2 >= INICIO && valor2 <= FIM) {
			
			// Os valores estão validados
			System.out.println("Usuario, qual operação deseja realizar?"
			+ "\n a) Somar"
			+ "\n b) Subtrair"
			+ "\n c) Muliplicar"
			+ "\n d) Dividir"
			+ "\n e) Raiz Quadrada"
			+ "\n f) Potenciação");
			opcao = sc.next().toLowerCase().charAt(0); // capturou, transformou o caractere em minúsculo(CASO O USUARIO COLOCAR A LETRA EM MAIUSCULO ELE IRA CONVERTER PARA SER COMPREENDIDO JA QUE O PROGRAMA SO RECONHECE LETRA MINÚSCULA) e captura apenas um caractere (char)
			
			switch (opcao) { // switch case em java é uma estrutura de controle de fluxo que permite executar diferentes blocos de código com base em diferentes valores de entrada.
			case 'a':
				txt = "Soma";
				resultado = valor1 + valor2;
				break;
			case 'b':
				txt = "Subtração";
				resultado = valor1 - valor2;
				break;
			case 'c':
				txt = "Multiplicação";
				resultado = valor1 * valor2;
				break;
			case 'd':
				txt = "Divisão";
				resultado = valor1 / valor2;
				break;
			case 'e':
				txt = "Raiz quadrada";
				System.out.println("Raiz Quadrada do valor 1 ou 2?");
				resposta = sc.nextInt();
				if(resposta == 1) {
					resultado = Math.sqrt(valor1);
				} else if (resposta == 2) {
					resultado = Math.sqrt(valor2);
				}else {
					System.out.println("Opção não existe");
				}
				break;
			case 'f':
				txt = "Potenciação";
				System.out.println("A base será o valor 1 ou 2?");
				resposta =  sc.nextInt();
				if (resposta == 1) {
					resultado = Math.pow(valor1, valor2); // Calculo de potenciação com base valor1 e expoete valor2
				} else if (resposta == 2) {
					resultado = Math.pow(valor2, valor1);
				} else {
					System.out.println("OPÇÂO NÂO EXISTE");
				}
				break;
			default:
			valida = false; // atribui o valor falso para a variábel 'valida'
			txt = "ERRO";
			break;
			}
			
			if(valida) {
				System.out.println(txt + " = " + resultado);
			} else {
				System.out.println("VALOR FORA DO INTERVALO");
			}
		}
        sc.close(); // Quando você chama sc. close() no método metodo() , ele não apenas fecha seu scanner, mas também fecha seu System.in fluxo de entrada.
    }
}
