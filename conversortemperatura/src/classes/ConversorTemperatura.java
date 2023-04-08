package classes;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

		System.out.println("Digite a  temperatura: ");
		double temp = sc.nextDouble();
		double resultado = 0;
        String texto = null;

		System.out.println("QUal a conversao que deseha "
				+ "realizar?"
				+ "\n a) celsius para kevin"
				+ "\n b) celsius para fahrenheit"
				+ "\n c) kelvin para celsius"
				+ "\n d) kevin para fahrenheit"
				+ "\n e) fahrenheit para celsius"
				+ "\n f) fahrenheit para kelvin");
		char opcao = sc.next().toLowerCase().charAt(0); // capturou, transformou o caractere em minúsculo e captura apenas um caractere para o formato char
		
		switch (opcao) {
		case 'a':
			texto = "celsius para kelvin";
			resultado = temp + 273.15;
			break;
		case 'b':
			texto = "celsius para fahrenheit";
			resultado = temp * 1.8 + 32;
			break;
		case 'c':
			texto = "kelvin para celsius";
			resultado = temp - 273;
			break;
		case 'd':
			texto = "kevin para fahrenheit";
			resultado = (temp - 273) * 1.8 + 32;
			break;
		case 'e':
			texto = "fahrenheit para celsius";
			resultado = (temp - 32) / 1.8;
			break;
		case 'f':
			texto = "fahrenheit para kelvin";
			resultado = (temp - 32) * 5 / 9 + 273;
			break;
		default:
			System.out.println("Opção não encontrada!");
			break;
		}
		
		System.out.println(texto + "=>" + resultado);

        sc.close();
    }
}
