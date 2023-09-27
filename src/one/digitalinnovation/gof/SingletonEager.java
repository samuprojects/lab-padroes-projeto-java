package one.digitalinnovation.gof;

/**
 * Singleton "apressado".
 * conceito de um singleton que já deixa pronto a instancia para o usuário
 * 
 * */

public class SingletonEager {
	
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstance() {
		return instance;
	}
}
