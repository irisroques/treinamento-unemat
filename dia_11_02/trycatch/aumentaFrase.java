package trycatch;

public class aumentaFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "frase teste";
		String novaFrase = null;
		
		try{
			novaFrase = frase.toUpperCase();
			} catch(NullPointerException e) {
				System.out.println("A frase está nula, atribui um valor default");
				frase = "Frase vazia";
				} finally {
					novaFrase = frase.toUpperCase();
				}
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: "+novaFrase);
	}

}
