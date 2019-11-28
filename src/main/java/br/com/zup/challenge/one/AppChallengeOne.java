package br.com.zup.challenge.one;

import java.io.File;

public class AppChallengeOne {
	
	public static void main(String[] args) {
		
		if (args.length > 0) {
		
			for (int i = 0; i < args.length; i++) {
				System.out.println("");
				System.out.println("O conteudo da pasta informada sera listado abaixo:");
				System.out.println("");
				System.out.println(args[i]);
				listFiles(args[i]);
			} 
		} else {
			System.out.println("Parametro obrigatorio nao inserido");
		}

		System.out.println("");
		System.out.println("Programa finalizado");
	}
	
	public static void listFiles(String args) {

		// transforma o endereço informado num arquivo
		File userDirectory = new File(args);
		
		// acessa o arquivo e vê se o endereço informado é uma pasta
		if (userDirectory.isDirectory()) {
			
			// lista todo o conteúdo da pasta
			File[] filesList = userDirectory.listFiles();

			// imprime todo o conteúdo da pasta, posição à posição
			for (int i = 0; i < filesList.length; i++) {
				
				System.out.println(filesList[i]);
				
				// se algum conteúdo (alguma posição) for também uma pasta, chama a função novamente dentro dela
				if (filesList[i].isDirectory()) {
					listFiles(filesList[i].toString());
				} 
			}
		} else {
			System.out.println("O caminho '" + args + "' nao e uma pasta");
		}
	}
}