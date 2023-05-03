package application;

import java.util.Scanner;

import entities.ConversorTemperatura;
import entities.Impressao;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Impressao.imprimir("Usuário, informe o valor em graus");
        double grau = sc.nextDouble();

        System.out.println("QUal a conversao que deseha "
		+ "realizar?"
		+ "\n a) celsius para kevin"
		+ "\n b) celsius para fahrenheit"
		+ "\n c) kelvin para celsius"
		+ "\n d) kevin para fahrenheit"
		+ "\n e) fahrenheit para celsius"
		+ "\n f) fahrenheit para kelvin");

        int key = sc.next().toLowerCase().charAt(0);

        Impressao.imprimir(escolha(grau, key));

        sc.close();
    }

    public static double escolha(double grau, int key){
        double res = 0;
        switch (key) {
            case 'a':
                res = ConversorTemperatura.celciusKelvin(grau);
                break;
            case 'b':
                res = ConversorTemperatura.celsiusFahrenheit(grau);
                break;
            case 'c':
                res = ConversorTemperatura.kelvinCelsius(grau);
                break;
            case 'd':
                res = ConversorTemperatura.kelvinFahrenheit(grau);
                break;
            case 'e':
                res = ConversorTemperatura.fahrenheitCelsius(grau);
                break;
            case 'f':
                res = ConversorTemperatura.fahrenheitKelvin(grau);
            default:
                res = 0;
                break;
        }
        return res;
    }
}
