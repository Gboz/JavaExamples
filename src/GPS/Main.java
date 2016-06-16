package GPS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static final String warning = "WARNING -> Problem z parsowaniem danych / niepoprawna sekwencja danych!";
	public static final String unknownSequence = "Nieznana sekwencja";
	public static final String separator = "-----------------------------------------------------------------------------";

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("dane.txt"));
		String pattern = in.nextLine();
		String helpVar;

		while (in.hasNextLine()) {
			if (pattern.substring(0, 1).equals("$") && pattern.length() <= 82) {
				System.out.println(pattern = in.nextLine());
				StringTokenizer st = new StringTokenizer(pattern, ",");

				switch (pattern.substring(3, 6)) {
				case "GGA":
					try {
						System.out.println("Nag³ówek: " + st.nextToken().substring(3, 6));
						helpVar = st.nextToken();
						System.out.println("Aktualnoœæ danych: " + helpVar.substring(0, 2) + ":"
								+ helpVar.substring(2, 4) + ":" + helpVar.substring(4, 6) + " UTC");
						helpVar = st.nextToken();
						System.out.println("Szerokoœæ geograficzna: " + helpVar.substring(0, 2) + " deg "
								+ helpVar.substring(2) + "' " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("D³ugoœæ geograficzna: " + helpVar.substring(0, 2) + " deg "
								+ helpVar.substring(2) + "' " + st.nextToken());
						System.out.println("Jakoœæ pomiaru: " + st.nextToken());
						System.out.println("Liczba œledzonych satelit: " + st.nextToken());
						System.out.println("Horyzontalna dok³adnoœæ pozycji: " + st.nextToken());
						System.out.println(
								"Wysokoœæ w metrach nad poziom morza: " + st.nextToken() + " " + st.nextToken());
						System.out.println("Wysokoœæ geoid: " + st.nextToken() + " " + st.nextToken());
						System.out.println("Suma kontrolna: " + st.nextToken());
					} catch (Exception e) {
						System.out.println(warning);
						System.out.println(separator);
						break;
					}
					System.out.println(separator);
					break;
				case "GLL":
					try {
						System.out.println("Nag³ówek: " + st.nextToken().substring(3, 6));
						helpVar = st.nextToken();
						System.out.println("Szerokoœæ geograficzna: " + helpVar.substring(0, 2) + " deg "
								+ helpVar.substring(2) + "' " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("D³ugoœæ geograficzna: " + helpVar.substring(0, 2) + " deg "
								+ helpVar.substring(2) + "' " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("Czas ustalenia pozycji: " + helpVar.substring(0, 2) + ":"
								+ helpVar.substring(2, 4) + ":" + helpVar.substring(4, 6));
						System.out.println("Status: " + st.nextToken());
					} catch (Exception e) {
						System.out.println(warning);
						System.out.println(separator);
						break;
					}
					System.out.println(separator);
					break;
				case "GSA":
					try {
						System.out.println("Nag³ówek: " + st.nextToken().substring(3, 6));
						System.out.println("Automatyczny wybór pozycji: " + st.nextToken() + " " + st.nextToken());
						System.out.print("Numery satelit: " + st.nextToken());
						helpVar = st.nextToken();
						while (!helpVar.equals("")) {
							double d = Double.valueOf(helpVar);
							if (d == (int) d) {
								System.out.print(", " + helpVar);
								helpVar = st.nextToken();
							} else {
								System.out.println();
								break;
							}
						}
						System.out.println("Precyzja wyznaczonej pozycji: " + helpVar);
						System.out.println("Horyzontalna precyzja wyznaczonej pozycji: " + st.nextToken());
						System.out.println("Wertykalna precyzja wyznaczonej pozycji: " + st.nextToken());
						System.out.println("Suma kontrolna: " + st.nextToken());
					} catch (Exception e) {
						System.out.println(warning);
						System.out.println(separator);
						continue;
					}
					break;
				case "GSV":
					try {
						System.out.println("Nag³ówek: " + st.nextToken().substring(3, 6));
						System.out.println("Liczba linii, które powinna otrzymaæ aplikacja: " + st.nextToken());
						System.out.println("Aktualna linia: " + st.nextToken());
						System.out.println("Liczba aktualnie widocznych satelitów: " + st.nextToken());
						System.out.println("Identyfikator PRN satelity: " + st.nextToken());
						System.out.println("Wyniesienie satelity nad poziom równika: " + st.nextToken());
						System.out.println("Azymut satelity: " + st.nextToken());
						System.out.println("Poziom odbierania sygna³u: " + st.nextToken());
						// TODO
					} catch (Exception e) {
						System.out.println(warning);
						System.out.println(separator);
						break;
					}
					System.out.println(separator);
					break;
				case "RMC":
					try {
						System.out.println("Nag³ówek: " + st.nextToken().substring(3, 6));
						helpVar = st.nextToken();
						System.out.println("Aktualnoœæ danych: " + helpVar.substring(0, 2) + ":"
								+ helpVar.substring(2, 4) + ":" + helpVar.substring(4, 6) + " UTC");
						System.out.println("Status: " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("Szerokoœæ geograficzna: " + helpVar.substring(0, 2) + " deg "
								+ helpVar.substring(2) + "' " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("D³ugoœæ geograficzna: " + helpVar.substring(0, 2) + " deg "
								+ helpVar.substring(2) + "' " + st.nextToken());
						System.out.println("Prêdkoœæ obiektu: " + st.nextToken());
						System.out.println("K¹t poruszania siê obiektu: " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("Data: " + helpVar.substring(0, 2) + "." + helpVar.substring(2, 4) + "."
								+ helpVar.substring(4, 6));
						System.out.println("Odchylenie magnetyczne ziemi: " + st.nextToken() + " " + st.nextToken());
						System.out.println("Suma kontrolna: " + st.nextToken());
					} catch (Exception e) {
						System.out.println(warning);
						System.out.println(separator);
						break;
					}
					System.out.println(separator);
					break;
				case "VTG":
					try {
						System.out.println("Nag³ówek: " + st.nextToken().substring(3, 6));
						helpVar = st.nextToken();
						System.out.println("Œcie¿ka poruszania siê w stopniach: " + helpVar + " " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("Œcie¿ka poruszania siê na podstawie wspó³rzêdnych magnetycznych: " + helpVar
								+ " " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("Prêdkoœæ w wêz³ach: " + helpVar + " " + st.nextToken());
						helpVar = st.nextToken();
						System.out.println("Prêdkoœæ w km/h: " + helpVar + " " + st.nextToken());
					} catch (Exception e) {
						System.out.println(warning);
						System.out.println(separator);
						break;
					}
					System.out.println(separator);
					break;
				default:
					System.out.println(unknownSequence);
					System.out.println(separator);
					break;
				}
			} else {
				continue;
			}
		}
		in.close();
	}
}
