package ex_biblioteca_aula3;
import javax.swing.JOptionPane;

public class Livraria {

	String editora;
	String autor;
	String livro;
	String idioma;	//novo atributo
	int quantidade;
	double preco;
	
	public void Informa_Livros(int codigo) {
		
		switch(codigo) {
		
		case 1: JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE \n" + 
		"LIVRO: " + livro +
		"\n EDITORA	: " + editora +
		"\n AUTOR: " + autor +
		"\n QUANTIDADE: " + quantidade +
		"\n PRECO: R$" + preco + 
		"\n IDIOMA: " + idioma,"", JOptionPane.PLAIN_MESSAGE); 
		break;
		
		case 2: JOptionPane.showMessageDialog(null, "CATEGORIA ESPÍRITA \n" + 
				"LIVRO: " + livro +
				"\n EDITORA	: " + editora +
				"\n AUTOR: " + autor +
				"\n QUANTIDADE: " + quantidade +
				"\n PRECO: R$" + preco + 
				"\n IDIOMA: " + idioma,"", JOptionPane.PLAIN_MESSAGE); 
		break;
				
		case 3: JOptionPane.showMessageDialog(null, "CATEGORIA INFORMÁTICA \n" + 
				"LIVRO: " + livro +
				"\n EDITORA	: " + editora +
				"\n AUTOR: " + autor +
				"\n QUANTIDADE: " + quantidade +
				"\n PRECO: R$" + preco + 
				"\n IDIOMA: " + idioma,"", JOptionPane.PLAIN_MESSAGE);
		break;
				
		default: System.out.println("Código não corresponde a nenhuma categoria de livro");
		}
	}
}
