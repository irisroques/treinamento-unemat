package abstracao;

public abstract class Conta {
	private double saldo;
	
	public void setSalto(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract void imprimeExtrato();
}
