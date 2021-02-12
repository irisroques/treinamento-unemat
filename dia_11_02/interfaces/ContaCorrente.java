package interfaces;

public class ContaCorrente implements Conta {
	private double saldo;
	private double taxaOperacao = 0.45;
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor - taxaOperacao; 
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		this.saldo -= valor + taxaOperacao;
		
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	
	}

}
