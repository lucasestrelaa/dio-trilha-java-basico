package pj_caixa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
	
	
	
	public static void main(String[] args) {
		/* TODO:conhecer e importar a classe scanner
		 * Exibir as mensagens para o nosso usuário
		 * Obter pela scanner os valores digitados no usuário
		 * exibir a mensagem da conta criada
		 */
		int Numero;
		String Agencia;
		String NomeCliente;
		Double Saldo;
		//declarando scanner
		Scanner ler = new Scanner(System.in);
		//Mensagem Inicial
		System.out.println("Bem vindo ao banco A");
		try {
			//criando objeto conta
			System.out.println("Digite o numero da conta:\n");
			Numero = ler.nextInt();
			
			System.out.println("Digite o numero da agência:\n");
			Agencia = ler.next();
			
			
			System.out.println("Digite o nome do cliente:\n");
			NomeCliente = ler.next();
			
			System.out.println("Digite o saldo:\n");
			Saldo = ler.nextDouble();
			ler.close();
			
			System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
		}catch(InputMismatchException err) {
			System.out.println("Deu erro!");
		}
	}

}
