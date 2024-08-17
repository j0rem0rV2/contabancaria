package Banco;

import java.util.Locale;
import java.util.Scanner;

public class Terminal {
	public static void main (String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o número da sua Agência: ");
		String agencia= scanner.next();
		System.out.print("Digite o número da sua conta: ");
		int numero = scanner.nextInt();
		System.out.print("Confirme o nome do proprietário desta conta, por favor: ");
		String nome= scanner.next();
		System.out.print("Confirme o seu saldo, por favor: ");
		double saldo= scanner.nextDouble();
		
		System.out.print("Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta"+ numero+ " e seu saldo R$"+ saldo+ " já está disponível para saque!");
	}
}
