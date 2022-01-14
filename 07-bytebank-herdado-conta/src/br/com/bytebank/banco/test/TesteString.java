package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		vazio.trim();// tira os espaço 
		System.out.println(vazio.isEmpty());
		String nome = "Alura";// object literal
		
		//String outro = new String("Alura");
		
		System.out.println(nome.replace("A", "a"));//faz troca das letras
		System.out.println(nome.toUpperCase());// retorna tudo maisculo
		System.out.println(nome.toLowerCase());// retorna tudo minisculo
		System.out.println(nome.charAt(1));
		int pos = nome.indexOf("r");
		System.out.println(pos);
		System.out.println(nome.substring(1));
		System.out.println(nome.length());
		
	
		System.out.println(nome.isEmpty());
		
		

	}

}
