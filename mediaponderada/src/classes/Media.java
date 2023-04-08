package classes;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media; // int: número inteiro; double: némeros reais; Lógico: boolean; caractere: String.
		
	    final double PESO1 = 3, PESO2 = 7; // esse 'final' significa que é uma constante e não pode mudar
	    System.out.println("Informe duas notas: ");
	    nota1 = sc.nextDouble();
	    nota2 = sc.nextDouble();
	    if (nota1 >= 0 && nota1 <= 10 && nota2 >=0 && nota2 <= 10) {
		media = (nota1 * PESO1 + nota2 * PESO2) / PESO1 + PESO2;
		if (media <= 3) {
			System.out.println("REPROVADO");
		} else if (media > 3 && media < 6) {
			System.out.println("FINAL");
		} else if (media > 6){
			System.out.println("APROVADO");
		} else if (media == 6) {
			System.out.println("FALTOU DEFINIR O 6");
		} else {
			System.out.println("DEU ERRO!!");
		}
		} else {
		System.out.println("Nota incorreta");
		}
        sc.close();
    }
}
