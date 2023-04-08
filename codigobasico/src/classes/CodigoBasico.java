package classes;

import java.util.Scanner;

public class CodigoBasico {
    /* Estou criando minha primeira instrução em java
	 * Comentário de multiplas linhas */
	
	/** Este é um comentário de documentação( posso criar 
	 * um arquivo HTML com todos os comentários do código */
	
	// Este é um comentário de somente uma linha
	
	/* Criando variáveis no java 
 	String nome; o String seria uma string com mais de um caractere
	nome = "Fernando";
	*/
	
	// Média aritmética
    public static void main(String[] args) throws Exception {
        /* Criando variáveis no java */
		String nome;
		nome = "Fernando";

        /* instrução para entrada de
		 * dados no console */
        Scanner sc = new Scanner(System.in); /*(sc é um apelido para toda vez que quiser dar um input) para importar apenas digitar shift+cntrl+o*/
        
        // Criação de variáveis do tipo duble
		double nota1, nota2, media; /* double =  numero real */
		
		// Saída no console do eclipse
		System.out.println("Informe a primeira nota de " + nome);
		
		// Obtendo dado do tipo double informado pelo usuário
		nota1 = sc.nextDouble(); 
		
		// Saída no console do eclipse
		System.out.println("Informe a segunda nota de " + nome);
		
		// Obtendo dado do tipo double informado pelo usuário
		nota2 = sc.nextDouble(); 
		
		media = (nota1 + nota2) / 2;
		System.out.println("A media de " + nome + " foi " + media);
		if(media >= 6) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		sc.close();
    }
}
