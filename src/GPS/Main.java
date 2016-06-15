package GPS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("dane.txt"));
		String pattern = in.nextLine();

		while (in.hasNextLine()) {
			if (pattern.substring(0, 1).equals("$") && pattern.length() <= 82) {
				System.out.println(pattern = in.nextLine());

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
					System.out.println("RMC");
					System.out.println(pattern.substring(pattern.indexOf(",")+1, 9) + ":" + pattern.substring(9, 11) + ":" + pattern.substring(11, 13) + " UTC");
					System.out.println("status: " + pattern.substring(14, 15));
					System.out.println(pattern.substring(16, 18) + " deg " + pattern.substring(18, 24) + "'" + pattern.substring(25, 26));
					System.out.println(pattern.substring(27, 29) + " deg " + pattern.substring(29, 35));
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
