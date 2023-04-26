package application;

import java.util.Scanner;

public class CalculoDoSalario {
    public static void main(String[] args) {
        double salarioAtual = salario();
        System.out.println("O salário atual é: " + salarioAtual);
        double aumentoDoSalario = aumento(salarioAtual);
        System.out.println("O aumento do salario é " + aumentoDoSalario);
        double salarioBruto = salarioBruto(salarioAtual, aumentoDoSalario);
        System.out.println("O salário bruto é " + salarioBruto);
        double impostoIR = impostoDeRenda(salarioBruto);
        System.out.println("O imposto do IR é " + impostoIR);
        double salarioLiquido = salarioLiquido(salarioBruto, impostoIR);
        System.out.println("O salário líquido é " + salarioLiquido);

    }

    // parametro é o que ele vai receber do tipo de dado

    // Método para retornar o salário do colaborador
    public static double salario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário atual: ");
        return sc.nextDouble();
    }

    // Método para calcular o aumento do salário da seguinte forma:
    // maior que 15000 -> 2,5%; maior que 10000 -> 5% e maior que 5000 -> 7%
    public static double aumento(double salario){
        double aumentoDoSalario;
        if(salario > 15000) {
            aumentoDoSalario = salario * 0.025;
        } else if(salario > 10000) {
            aumentoDoSalario = salario * 0.05;
        } else if(salario > 5000) {
            aumentoDoSalario = salario * 0.07;
        } else {
            aumentoDoSalario = 0;
        }
        return aumentoDoSalario;
    }

    // Método para calcular o salário Bruto
    public static double salarioBruto(double salario, double aumento) {
        return salario + aumento;
    }

    // Método para calcular o IR
    /* salário bruto maior que 15000 -> 30%
     * salário bruto maior que 10000 -> 20%
     * salário bruto maior que 5000 -> 10% */
    public static double impostoDeRenda(double salarioBruto) {
        double ir;
        if(salarioBruto > 15000) {
            ir = 15000 * 0.3;
        } else if(salarioBruto > 10000) {
            ir = 10000 * 0.2;
        } else if(salarioBruto > 5000) {
            ir = 5000 * 0.1;
        } else {
            ir = 0;
        }
        return ir;
    }

    // Método para calcular o salário líquido (final)
    // no double sb, e ir eu posso colocar quelquer nome para esses dois parametros ja que o que conta é la em cima no main na hora de executar esses parametros
    public static double salarioLiquido(double sb, double IR) {
        return sb - IR;
    }
}
