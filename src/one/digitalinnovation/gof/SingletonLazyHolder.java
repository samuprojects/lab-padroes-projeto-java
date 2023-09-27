package one.digitalinnovation.gof;

/**
 * Singleton "Lazy Holder".
 * 
 * essa implementação faz o encapsulamento da instancia em uma classe estática interna, alguns dizens que é mais o timizado
 * e é recomendado em alguns cenários por ser Thread safe, etc.
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * */

public class SingletonLazyHolder {
	
	private static class InstanceHolder{ // essa classe tem apenas a função de encapsular a instancia
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
		
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instance;
	}
	
}
