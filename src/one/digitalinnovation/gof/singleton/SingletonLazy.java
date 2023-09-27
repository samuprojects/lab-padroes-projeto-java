package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 * conceito de um singleton que não disponibiliza a instancia num primeiro momento para o usuário
 * primeiro vai testar se existe alguma instancia para depois providenciá-la
 * 
 * */

public class SingletonLazy {
	
	private static SingletonLazy instance;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstance() {
		if(instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
