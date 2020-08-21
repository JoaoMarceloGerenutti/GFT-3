package entities;

public class ContaCorrente extends Conta {

	private Double taxaJuro = 0.03;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numero, String titular, Double saldo) {
		super(numero, titular, saldo);
	}

	public Double getTaxaJuro() {
		return taxaJuro;
	}

	public void setTaxaJuro(Double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}
	
	@Override
	public void rendimento(Double saldo) {
		saldo += saldo * taxaJuro;
	}

	@Override
	public String toString() {
		return "Conta Corrente: "
				+ "Número: " + getNumero()
				+ "Titular: " + getTitular()
				+ "Saldo: " + getSaldo();
	}
	
	
}
