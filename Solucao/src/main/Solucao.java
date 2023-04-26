package main;

import java.util.Scanner;

public class Solucao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o primeior valor");
        int x = sc.nextInt();
        System.out.println("Informe o segundo valor");
        int y = sc.nextInt();

        System.out.println("Escolha a operação desejada: \n 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir");
        int e = sc.nextInt();
        operacaoEscolhida(x, y, e);


        sc.close();
    }

    // todos os metodos que eu criar, tem que estar dentro de uma classe, nesse caso a classe é 'solucao'

   /* 
    exemplo:
    Scanner sc = new Sanner(System.in);
    x = sc.nextInt;
    Scanner é uma classe e nextInt é um metodo da classe
    */

    // 'static' significa que esse metodo esta pertencente a classe
    // void singidica que o método não devolve nada ( não tem return )
    // quando o metodo é '()'' ele não tem parâmetro
    
    // método de soma
    public static int soma(int parcela1, int parcela2) {
        return parcela1 + parcela2;
    }

    // método de subtrair
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // método de dividir
    public static int dividir(int x, int y) {
        return x / y;
    }

    // método de multiplicar
    public static int multiplicar(int x, int y) {
        return x * y;
    }

    // método para executar a operação escolhida pelo usuário
    public static void operacaoEscolhida(int valor1, int valor2, int escolha) {
        switch (escolha) {
            case 1:
                System.out.println(soma(valor2, valor2));
                break;
            case 2:
                System.out.println(subtrair(valor1, valor2));
                break;
            case 3:
                System.out.println(multiplicar(valor1, valor2));
                break;
            case 4:
                System.out.println(dividir(valor1, valor2));
                break;
            default:
                System.out.println("Essa operação não existe");
                break;
        }
    }


}
