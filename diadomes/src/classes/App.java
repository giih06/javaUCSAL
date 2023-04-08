package classes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Elabore uma solução para que a partir de um corresponde ao mês, a solução presente quantos dias tem o mês

        Scanner sc = new Scanner(System.in);
        char opcao;
        int dias = 0;
        String mes = null;
        System.out.println("Digite uma letra correspondente a um mês para descobrir quantos dias tem esse mês!"
			+ "\n a) Janeiro"
			+ "\n b) Fevereiro"
			+ "\n c) Março"
			+ "\n d) Abril"
			+ "\n e) Maio"
			+ "\n f) Junho"
            + "\n g) Julho"
			+ "\n h) Agosto"
			+ "\n i) Setembro"
			+ "\n j) Outubro"
            + "\n k) Novembro"
			+ "\n l) Dezembro");
        opcao = sc.next().toLowerCase().charAt(0);
        switch (opcao) {
            case 'a':
                dias = 31;
                mes = "Janeiro";
                break;
            case 'b':
                dias = 28;
                mes = "Fevereiro";
                break;
            case 'c':
                dias = 31;
                mes = "Março";
                break; 
            case 'd':
                dias = 30;
                mes = "Abril";
                break;    
            case 'e':
                dias = 31;
                mes = "Maio";
                break;
            case 'f':
                dias = 30;
                mes = "Junho";
                break;
            case 'g':
                dias = 31;
                mes = "Julho";
                break; 
            case 'h':
                dias = 31;
                mes = "Agosto";
                break; 
            case 'i':
                dias = 30;
                mes = "Setembro";
                break;
            case 'j':
                dias = 31;
                mes = "Outubro";
                break; 
            case 'k':
                dias = 30;
                mes = "Novembro";
                break;
            case 'l':
                dias = 31;
                mes = "Dezembro";
                break;
            default:
                System.out.println("OPÇÃO NÃO EXISTE");
                break;
        }
        System.out.println("São " + dias + " dias em " + mes);
        sc.close();
    }
}
