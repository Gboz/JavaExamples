package GPS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("dane.txt"));
		String pattern = in.nextLine();

		while (in.hasNextLine()) {
			if (pattern.substring(0, 1).equals("$") && pattern.length() <= 82) {
				System.out.println(pattern = in.nextLine());
				StringTokenizer st = new StringTokenizer(pattern, ",");

				switch (pattern.substring(3, 6)) {
				case "GGA":
					System.out.println("GGA");
					break;
				case "GLL":
					System.out.println("GLL");
					break;
				case "GSA":
					System.out.println("GSA");
					break;
				case "GSV":
					System.out.println("GSV");
					break;
				case "RMC":
					String helpVar;
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
						break;
					}

					System.out.println("----------------------");
					break;
				case "VTG":
					System.out.println("VTG");
					break;
				default:
					System.out.println("Nieznana sekwencja");
					break;
				}

			} else {
				continue;
			}

		}

	}

}
