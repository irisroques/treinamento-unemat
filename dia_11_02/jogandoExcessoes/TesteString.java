package jogandoExcessoes;

public class TesteString {
	private static void semB() throws SemLetraBException
	{
		
	}
	
	public static void main(String args[]) {
		try {
			semB();
		} catch(SemLetraBException e) {
			System.out.println("Não tem B :c  " + e);
		}
		
	}
}
