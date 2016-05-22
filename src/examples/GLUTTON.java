package examples;
import java.util.Scanner;

public class GLUTTON {

	private static final int dayToSeconds = 60 * 60 * 24;
	private static int liczbaTestow;
	private static int liczbaObzartuchow;
	private static double liczbaCiastekWJednymPudelku;
	private static int czasZjedzeniaJednegoCiasteczka;
	private static int pudelkaCiastekDoZamowienia;
	private static double wszystkieCiasteczkaDoZjedzenia;
	private static int ciasteczka;

	public static void main(String[] args) {
		System.out.println("################");
		System.out.println("#Start programu#");
		System.out.println("################\n");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Podaj liczb� test�w: ");
		liczbaTestow = scanner.nextInt();

		for (int i = 1; i <= liczbaTestow; i++) {
			System.out.println("obr�t p�tli nr " + i);

			System.out.print("Podaj liczb� ob�artuch�w: ");
			liczbaObzartuchow = scanner.nextInt();

			System.out.print("Podaj liczb� ciastek w pude�ku: ");
			liczbaCiastekWJednymPudelku = scanner.nextInt();

			for (int j = 1; j <= liczbaObzartuchow; j++) {
				System.out.print("Czas zjedzenia jednego ciasteczka przez ob�artucha nr: " + j + ": ");
				czasZjedzeniaJednegoCiasteczka = scanner.nextInt();
				ciasteczka = (int) dayToSeconds / czasZjedzeniaJednegoCiasteczka;
				System.out.println(ciasteczka + " ciasteczka zjedzone przez ob�artucha: " + j);
				wszystkieCiasteczkaDoZjedzenia += ciasteczka;
				System.out.println("pula ciasteczek: " + wszystkieCiasteczkaDoZjedzenia);
			}

			pudelkaCiastekDoZamowienia = (int) Math.ceil(wszystkieCiasteczkaDoZjedzenia / liczbaCiastekWJednymPudelku);
			System.out.println("Potrzeba z�o�y� zam�wienie na: " + pudelkaCiastekDoZamowienia + " pude�ek ciastek");
		}

		System.out.println("\n#################");
		System.out.println("#Koniec programu#");
		System.out.println("#################");
	}

}
