package unemat;	

public class Carro {
	String tamanho;
	private Cores cor;
	private float peso;
	private float altura;
	
	private void acelerar() {}
	private void parar() {}
	private void ligar() {}
	private void desligar() {}
	
	
	
	/**
	 * @param tamanho
	 * @param cor
	 * @param peso
	 * @param altura
	 */
	public Carro(String tamanho, Cores cor, int peso, float altura) {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	/**
	 * @param cor
	 */
	public Carro(Cores cor) {
		//super();
		this.cor = cor;
	}
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the tamanho
	 */
	public String getTamanho() {
		return tamanho;
	}
	/**
	 * @param tamanho the tamanho to set
	 */
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	/**
	 * @return the cor
	 */
	public Cores getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(Cores cor) {
		this.cor = cor;
	}
	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

}
