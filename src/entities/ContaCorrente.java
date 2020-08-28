package entities;

public class ContaCorrente extends Conta {

	private static final Double taxaJuro = 0.03;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numero, String titular, Double saldo) {
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
