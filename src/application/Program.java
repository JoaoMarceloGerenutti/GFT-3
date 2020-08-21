package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CONTA CORRENTE");
		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Titual: ");
		String titular = sc.nextLine();
		
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();
		
		ContaCorrente contaCorrente = new ContaCorrente(numero, titular, saldo);
		
		System.out.println("CONTA CORRENTE");
		System.out.print("Número da conta: ");
		int numeroPoupanca = sc.nextInt();
		
		System.out.print("Titual: ");
		String titularPoupanca = sc.nextLine();
		
		System.out.print("Saldo: ");
		double saldoPoupanca = sc.nextDouble();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(numeroPoupanca, titularPoupanca, saldoPoupanca);
		
		
		sc.close();
	}

}
