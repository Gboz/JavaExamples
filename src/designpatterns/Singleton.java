package designpatterns;

public class Singleton {
	private Singleton() {
	}

	private static class SingletonHolder {
		static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public static void main(String[] args) {
		Singleton singleton = new Singleton();
		System.out.println(singleton);
		System.out.println(singleton.toString());
	}

}
