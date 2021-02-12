package poli;

public class Gato extends Animal {
	public void emiteSom() {
		System.out.println("miau miau miau");
	}
	
	public void taxidermia() {
		System.out.println(super.ordem);
	}
	
	public void patas() {
		System.out.println(super.getQntPatas());
	}
	

	
}
