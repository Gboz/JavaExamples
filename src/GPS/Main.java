package GPS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("dane.txt"));
		String pattern = in.nextLine();
		String helpVar01;

		while (in.hasNextLine()) {
			if (pattern.substring(0, 1).equals("$") && pattern.length() <= 82) {
				System.out.println(pattern = in.nextLine());
				StringTokenizer st = new StringTokenizer(pattern, ",");

				switch (pattern.substring(3, 6)) {
				case "GGA":
					System.out.println("GGA");
					System.out.println("---------------------------------------------------------");
					break;
				case "GLL":
					System.out.println("GLL");
					System.out.println("---------------------------------------------------------");
					break;
				case "GSA":
					try {
						System.out.println("Nag³ówek: " + st.nextToken().substring(3, 6));
						System.out.println("Automatyczny wybór pozycji: " + st.nextToken() + " " + st.nextToken());
						System.out.print("Numery satelit: " + st.nextToken());
						helpVar01 = st.nextToken();
						while (!helpVar01.equals("")) {
							double d = Double.valueOf(helpVar01);
							if (d == (int) d) {
								System.out.print(", " + helpVar01);
								helpVar01 = st.nextToken();
							} else {
								System.out.println();
								break;
							}
						}
						System.out.println("Precyzja wyznaczonej pozycji: " + helpVar01);
						System.out.println("Horyzontalna precyzja wyznaczonej pozycji: " + st.nextToken());
						System.out.println("Wertykalna precyzja wyznaczonej pozycji: " + st.nextToken());
						System.out.println("Suma kontrolna: " + st.nextToken());

					} catch (Exception e) {
						System.out.println("---------------------------------------------------------");
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
						System.out.println("---------------------------------------------------------");
						break;
					}

					System.out.println("---------------------------------------------------------");
					break;
				case "RMC":
					try {
						System.out.println("Nag³ówek: " + st.nextToken().substring(3, 6));
						helpVar01 = st.nextToken();
						System.out.println("Aktualnoœæ danych: " + helpVar01.substring(0, 2) + ":"
								+ helpVar01.substring(2, 4) + ":" + helpVar01.substring(4, 6) + " UTC");
						System.out.println("Status: " + st.nextToken());
						helpVar01 = st.nextToken();
						System.out.println("Szerokoœæ geograficzna: " + helpVar01.substring(0, 2) + " deg "
								+ helpVar01.substring(2) + "' " + st.nextToken());
						helpVar01 = st.nextToken();
						System.out.println("D³ugoœæ geograficzna: " + helpVar01.substring(0, 2) + " deg "
								+ helpVar01.substring(2) + "' " + st.nextToken());
						System.out.println("Prêdkoœæ obiektu: " + st.nextToken());
						System.out.println("K¹t poruszania siê obiektu: " + st.nextToken());
						helpVar01 = st.nextToken();
						System.out.println("Data: " + helpVar01.substring(0, 2) + "." + helpVar01.substring(2, 4) + "."
								+ helpVar01.substring(4, 6));
						System.out.println("Odchylenie magnetyczne ziemi: " + st.nextToken() + " " + st.nextToken());
						System.out.println("Suma kontrolna: " + st.nextToken());
					} catch (Exception e) {
						System.out.println("---------------------------------------------------------");
						break;
					}
					System.out.println("---------------------------------------------------------");
					break;
				case "VTG":
					System.out.println("VTG");
					System.out.println("---------------------------------------------------------");
					break;
				default:
					System.out.println("Nieznana sekwencja");
					System.out.println("---------------------------------------------------------");
					break;
				}

			} else {
				continue;
			}

		}
		in.close();
	}

}
