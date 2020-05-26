package br.com.zup.challenge.one;

import java.io.File;

public class AppChallengeOne {
	
	public static void main(String[] args) {
		
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println("\nO conteudo da pasta informada sera listado abaixo:\n");
				System.out.println(args[i]);
				listFiles(args[i]);
			} 
		} else {
			System.out.println("Parametro obrigatorio nao inserido");
		}

		System.out.println("\nPrograma finalizado");
	}
	
	public static void listFiles(String args) {

		File pathName = new File(args);
		
		if (pathName.isDirectory()) {
			File[] content = pathName.listFiles();
			for (int i = 0; i < content.length; i++) {
				System.out.println(content[i]);
				if (content[i].isDirectory()) {
					listFiles(content[i].toString());
				} 
			}
		} else {
			System.out.println("O caminho '" + args + "' nao e uma pasta");
		}
	}
}