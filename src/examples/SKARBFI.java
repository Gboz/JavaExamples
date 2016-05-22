package examples;
import java.util.Scanner;

public class SKARBFI {
	static int liczbaZestawow;
	static int wspX, wspY;

	public static void main(String[] args) {
		System.out.println("################");
		System.out.println("#Start programu#");
		System.out.println("################\n");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbê zestawów danych: ");
		liczbaZestawow = scanner.nextInt();

		for (int i = 1; i <= liczbaZestawow; i++) {
			System.out.println("Zestaw nr: " + i);
			int liczbaWskazowek;
			System.out.print("liczba wskazówek: ");
			liczbaWskazowek = scanner.nextInt();
			int kierunek, liczbaKrokow;
			for (int j = 1; j <= liczbaWskazowek; j++) {
				System.out.print("kierunek: ");
				kierunek = scanner.nextInt();
				System.out.print("liczba kroków: ");
				liczbaKrokow = scanner.nextInt();

				switch (kierunek) {
				case 0:
					System.out.println("idz na pó³noc " + liczbaKrokow + " kroków");
					wspY += liczbaKrokow;
					break;
				case 1:
					System.out.println("idz na po³ódnie " + liczbaKrokow + " kroków");
					wspY -= liczbaKrokow;
					break;
				case 2:
					System.out.println("idz na zachód " + liczbaKrokow + " kroków");
					wspX -= liczbaKrokow;
					break;
				case 3:
					System.out.println("idz na wschód " + liczbaKrokow + " kroków");
					wspX += liczbaKrokow;
					break;
				default:
					System.out.println("nieznany kierunek");
				}
			}

			System.out.println("DROGA DO SKARBU");
			if (wspY > 0) {
				System.out.println("idz na pó³noc " + wspY + " kroków");
			} else if (wspY < 0) {
				System.out.println("idz na po³ódnie " + wspY + " kroków");
			}

			if (wspX > 0) {
				System.out.println("idz na wschód " + wspX + " kroków");
			} else if (wspX < 0) {
				System.out.println("idz na zachód " + wspX + " kroków");
			}

			if (wspY == 0 && wspX == 0) {
				System.out.println("skarb jest w studni");
			}

		}

		System.out.println("\n#################");
		System.out.println("#Koniec programu#");
		System.out.println("#################");
	}

}
