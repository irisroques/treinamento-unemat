package jogandoExcessoes;

public class SemLetraBException extends Exception {
	@Override
	public String getMessage() {
		return "Não existe letra b em sua frase";
	}
	
}
