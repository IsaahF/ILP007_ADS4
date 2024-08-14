package encapsulamento2_aula4;

import encapsulamento1_aula4.Acesso_Numeros;

public class Verifica_Encapsulamento_2 {
public static void main (String args[]) {
	
	Acesso_Numeros chave = new Acesso_Numeros();
	
	//chave.a = 10;  n deu tbm, n pode acessar fora do pacote :(
	chave.setNumero("a", 10);
	chave.b = 20;
	chave.setNumero("c", 30);
	chave.setNumero("d", 40);

	chave.mostra_numero();
	
}
	
}
