package entities;

public class ContaPoupanca extends Conta {

	private static final Double taxaJuro = 0.05;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo) {
		super(numero, titular, saldo);
	}

	public Double getTaxaJuro() {
		return taxaJuro;
	}
	
	@Override
	public double rendimento(Double saldo) {
		return saldo += saldo * taxaJuro;
	}
	
	@Override
	public String toString() {
		return  "Número: " + getNumero() + ", "
				+ "Titular: " + getTitular() + ", "
				+ "Saldo: " + String.format("%.2f", getSaldo()) + ", "
				+ "Rendimento: " + String.format("%.2f", rendimento(saldo));
	}
}
