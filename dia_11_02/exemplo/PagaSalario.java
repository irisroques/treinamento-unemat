package exemplo;

public class PagaSalario {

	public PagaSalario() {
		// TODO Auto-generated constructor stub
	}
	
	float valor = 3000;//imagem que esse valor vem de um banco de dados
	boolean decimoTerceiro = true;
	int horasExtras;
	
	public float salario(String nome) {
		
		return valor;
	}
	
	public float salario(String nome, boolean decimoTerceiro) {
		valor = valor + 3000;
		return valor;
		
	}
	
	public float salario(String nome, int horasExtras) {
		return valor = valor + horasExtras*30;
		
	}

}
