package classes;

import java.util.Scanner;

public class Triangulo {
    /* O usuário deverá informar o3 valores e o algoritmo
 * vai definir o tipo de triangulo quanto aos lados: Equilátero
 * (03 iguais) , isóceles (2 iguais e um diferente) ou Escaleno 
 * (03 diferentes). */
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
		int a1, a2, a3;
		System.out.println("Digite os valores dos lados de um triangulo");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		if (a1 == a2 && a2== a3){
			System.out.println("Equilátero");
		} else if (a1 != a2 && a2 != a3 && a1 != a3){
			System.out.println("Escaleno");
		} else {
			System.out.println("Isóceles");
		}
        sc.close();
    }
}
