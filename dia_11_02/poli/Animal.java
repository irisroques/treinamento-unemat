package poli;

public class Animal {
	
	String ordem = "carnivora";
	private static int qntPatas = 4;
	
	public void emiteSom(){
		System.out.println("Som do animal");
	}

	public static int getQntPatas() {
		return qntPatas;
	}

	public static void setQntPatas(int qntPatas) {
		Animal.qntPatas = qntPatas;
	}

}
