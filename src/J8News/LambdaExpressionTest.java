package J8News;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class LambdaExpressionTest {

	// parameter -> expression body

	public static void main(String[] args) {

		String dane = "tekst1=aaa;" + "tekst2=bbb;" + "tekst3=ccc;";
		// Tworzymy obiekt StringTokenizer
		StringTokenizer stringTokenizer = new StringTokenizer(dane, "=;");
		while (stringTokenizer.hasMoreTokens()) {
			String klucz = stringTokenizer.nextToken();
			String wartosc = stringTokenizer.nextToken();
			System.out.println(klucz + " = " + wartosc);
		}

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
