import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero;
		String agencia;
		String nomeDoCliente;
		double saldo;

		System.out.println("Por favor, digite o seu nome!");
		nomeDoCliente = entrada.nextLine();

		System.out.println("Por favor, digite o número da Agência!");
		numero = Integer.parseInt(entrada.nextLine());

		System.out.println("Por favor, digite a Agência!");
		agencia = entrada.nextLine();

		System.out.println("Por favor, digite o seu saldo!");
		saldo = Double.parseDouble(entrada.nextLine());

		entrada.close();

		System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco.%n" +
					      "Sua agência é %s, conta é %d e seu saldo %.2f já está disponível para saque.%n", 
						  nomeDoCliente, 
					      agencia, 
					      numero, 
						  saldo); 	
	}
}
