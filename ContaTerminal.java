import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero;
		String agencia;
		String nomeDoCliente;
		double saldo;

		System.out.println("Por favor, digite o número da Agência!");
		numero = input.nextInt();

		System.out.println("Por favor, digite a Agência!");
		agencia = input.next();

		System.out.println("Por favor, digite o seu nome!");
		nomeDoCliente = input.next();

		System.out.println("Por favor, digite o seu saldo!");
		saldo = input.nextDouble();

		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.%n", nomeDoCliente, agencia, numero, saldo); 	
	}
}
