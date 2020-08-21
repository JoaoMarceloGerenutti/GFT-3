package entities;

public class ContaPoupanca extends Conta {

	private Double taxaJuro = 0.05;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo) {
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
}
