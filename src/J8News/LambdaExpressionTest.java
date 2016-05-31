package J8News;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionTest {

	// parameter -> expression body

	public static void main(String[] args) {

		// Example implement simple interface
		Powitanie powitanie = msg -> System.out.println("Hello " + msg);
		powitanie.wiadomosc("Agata");

		// method
		List lista = new ArrayList();

		lista.add("Janek");
		lista.add("Majkel");
		lista.add("Agatka");

		lista.forEach(System.out::println);

	}

	interface Powitanie {
		void wiadomosc(String msg);
	}

}
