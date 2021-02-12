package unemat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c = new Carro();
		c.setCor(Cores.Azul);
		
		Carro c1 = new Carro(Cores.Preto);
		
		//(String tamanho, Cores cor, int peso, float altura)
		Carro c2 = new Carro("SUV", Cores.Branco, 200, 2);
		
		System.out.printf("A cor do carro eh " + c2.getCor() + "o tamanho do carro eh " + c2.tamanho);
		System.out.printf(" O peso do carro eh %f e a altura é %f \n", c2.getPeso(), c2.getAltura());
		
		System.out.println("A cor do carro eh " + c.getCor());
		
		System.out.println("A cor do carro eh " + c1.getCor());
		
		
	}

}
