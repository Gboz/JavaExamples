package GPS;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		String data;
		data = JOptionPane.showInputDialog("Podaj dane do parsowania:");

		if (data.substring(0, 1).equals("$")) {
			JOptionPane.showMessageDialog(null, "Dane do Parsowania " + data);
			System.out.println("Dane do Parsowania " + data);
			// wy�wietlamy powitanie
			if (data.length() <= 82) {
				if (data.substring(3, 6).equals("GGA")) {
					// identyfikator nag��wka
					String wynik = data.substring(3, 6);
					// godzina
					String wynik1 = data.substring(7, 9);
					String wynik2 = data.substring(9, 11);
					String wynik3 = data.substring(11, 13);
					// szerokosc geogr
					String wynik4 = data.substring(13, 17);
					String wynik5 = data.substring(17, 23);
					String wynik6 = data.substring(24, 25);
					// dlugosc geogr
					String wynik7 = data.substring(26, 29);
					String wynik8 = data.substring(29, 35);
					String wynik9 = data.substring(36, 37);
					// Pomiar
					String wynik10 = data.substring(37, 38);
					// liczba satelit�w
					String wynik11 = data.substring(39, 41);
					// horyznotalna dok�adno�� pozycji
					String wynik12 = data.substring(42, 45);

					// wysoko�� w metrach nad poziom morza
					String wynik13 = data.substring(46, 53);
					// wysoko�� geoid (powy�ej elipsoidy WGS84)
					String wynik14 = data.substring(54, 60);
					// suma kontrolna
					String wynik15 = data.substring(62, 65);
					// Wy�wietlanie
					JOptionPane.showMessageDialog(null, wynik + "�identyfikator nag��wka");
					JOptionPane.showMessageDialog(null,
							"Aktualny Czas: " + wynik1 + ":" + wynik2 + ":" + wynik3 + " UTC");
					JOptionPane.showMessageDialog(null,
							"Szeroko�� geograficzna (latitude) - " + wynik4 + " deg " + wynik5 + "' " + wynik6);
					JOptionPane.showMessageDialog(null,
							"D�ugo�� geograficzna (longitude) - " + wynik7 + " deg " + wynik8 + "' " + wynik9);

					System.out.println(wynik + "�identyfikator nag��wka");
					System.out.println("Aktualny Czas: " + wynik1 + ":" + wynik2 + ":" + wynik3 + " UTC");
					System.out.println(
							"Szeroko�� geograficzna (latitude) - " + wynik4 + " deg " + wynik5 + "' " + wynik6);
					System.out
							.println("D�ugo�� geograficzna (longitude) - " + wynik7 + " deg " + wynik8 + "' " + wynik9);
					if (wynik10.equals("0")) {
						JOptionPane.showMessageDialog(null,
								"Jako�� pomiaru: " + wynik10 + " " + "Brak pozycji, lub bardzo du�y b��d");
						System.out.println("Jako�� pomiaru: " + wynik10 + " " + "Brak pozycji, lub bardzo du�y b��d");
					} else if (wynik10.equals("1")) {
						JOptionPane.showMessageDialog(null,
								"Jako�� pomiaru: " + wynik10 + " " + "Pozycja okre�lona na podstawie GPS (SPS)");
						System.out.println(
								"Jako�� pomiaru: " + wynik10 + " " + "Pozycja okre�lona na podstawie GPS (SPS)");
					} else if (wynik10.equals("2")) {
						JOptionPane.showMessageDialog(null,
								"Jako�� pomiaru: " + wynik10 + " " + "Pozycja okre�lona przy udziale DGPS");
						System.out.println("Jako�� pomiaru: " + wynik10 + " " + "Pozycja okre�lona przy udziale DGPS");
					} else if (wynik10.equals("3")) {
						JOptionPane.showMessageDialog(null, "Jako�� pomiaru: " + wynik10 + " " + "Pozycja PPS");
						System.out.println("Jako�� pomiaru: " + wynik10 + " " + "Pozycja PPS");
					} else if (wynik10.equals("4")) {
						JOptionPane.showMessageDialog(null, "Jako�� pomiaru: " + wynik10 + " " + "Real Time Kinematic");
						System.out.println("Jako�� pomiaru: " + wynik10 + " " + "Real Time Kinematic");
					} else if (wynik10.equals("5")) {
						JOptionPane.showMessageDialog(null, "Jako�� pomiaru: " + wynik10 + " " + "Float RTK");
						System.out.println("Jako�� pomiaru: " + wynik10 + " " + "Float RTK");
					} else if (wynik10.equals("6")) {
						JOptionPane.showMessageDialog(null,
								"Jako�� pomiaru: " + wynik10 + " " + "Estimated (dead reconing)");
						System.out.println("Jako�� pomiaru: " + wynik10 + " " + "Estimated (dead reconing)");
					} else if (wynik10.equals("7")) {
						JOptionPane.showMessageDialog(null, "Jako�� pomiaru: " + wynik10 + " " + "Manual input mode");
						System.out.println("Jako�� pomiaru: " + wynik10 + " " + "Manual input mode");
					} else if (wynik10.equals("8")) {
						JOptionPane.showMessageDialog(null, "Jako�� pomiaru: " + wynik10 + " " + "Tryb symulacji");
						System.out.println("Jako�� pomiaru: " + wynik10 + " " + "Tryb symulacji");
					}
					JOptionPane.showMessageDialog(null, "Liczba satelit�w - " + wynik11);
					JOptionPane.showMessageDialog(null, "Horyznotalna dok�adno�� pozycji - " + wynik12);
					JOptionPane.showMessageDialog(null, "Wysoko�� w metrach nad poziom morza - " + wynik13);
					JOptionPane.showMessageDialog(null, "Wysoko�� geoid (powy�ej elipsoidy WGS84) - " + wynik14);
					JOptionPane.showMessageDialog(null, "Suma kontrolna: " + wynik15);

					System.out.println("Liczba satelit�w - " + wynik11);
					System.out.println("Horyznotalna dok�adno�� pozycji - " + wynik12);
					System.out.println("Wysoko�� w metrach nad poziom morza - " + wynik13);
					System.out.println("Wysoko�� geoid (powy�ej elipsoidy WGS84) - " + wynik14);
					System.out.println("Suma kontrolna: " + wynik15);

				} else if (data.substring(3, 6).equals("GLL")) {
					// $GPGLL,4916.45,N,12311.12,W,225444,A,*31
					System.out.println(data.substring(3, 6) + "�identyfikator nag��wka");
					// Szeroko�c
					String wynik1 = data.substring(7, 9);
					String wynik2 = data.substring(9, 14);
					String wynik3 = data.substring(15, 16);

					// D�ugo��
					String wynik4 = data.substring(17, 20);
					String wynik5 = data.substring(20, 25);
					String wynik6 = data.substring(26, 27);
					// Godzina
					String wynik7 = data.substring(28, 30);
					String wynik8 = data.substring(30, 32);
					String wynik9 = data.substring(32, 34);
					// Status
					String wynik10 = data.substring(35, 36);
					// Suma kontrolna
					String wynik11 = data.substring(37, 40);
					JOptionPane.showMessageDialog(null,
							"Szeroko�� geograficzna (latitude) - " + wynik1 + " deg " + wynik2 + "' " + wynik3);
					JOptionPane.showMessageDialog(null,
							"D�ugo�� geograficzna (longitude) - " + wynik4 + " deg " + wynik5 + "' " + wynik6);
					JOptionPane.showMessageDialog(null,
							"Godzina ustalenia pozycji (" + wynik7 + ":" + wynik8 + ":" + wynik9 + ")");

					System.out.println(
							"Szeroko�� geograficzna (latitude) - " + wynik1 + " deg " + wynik2 + "' " + wynik3);
					System.out
							.println("D�ugo�� geograficzna (longitude) - " + wynik4 + " deg " + wynik5 + "' " + wynik6);
					System.out.println("Godzina ustalenia pozycji (" + wynik7 + ":" + wynik8 + ":" + wynik9 + ")");

					if (wynik10.equals("A")) {
						JOptionPane.showMessageDialog(null, "Status " + wynik10 + " aktywny");
						System.out.println("Status " + wynik10 + " aktywny");
					} else if (wynik10.equals("V")) {
						JOptionPane.showMessageDialog(null, "Status " + wynik10 + " nieaktywny");
						System.out.println("Status " + wynik10 + " nieaktywny");
					}
					JOptionPane.showMessageDialog(null, "Suma kontroli: " + wynik11);
					System.out.println("Suma kontroli: " + wynik11);
				} else if (data.substring(3, 6).equals("GSA")) {

					String wynik1 = data.substring(7, 10);
					String wynik2 = data.substring(11, 33);
					String wynik3 = data.substring(33, 36);
					String wynik4 = data.substring(37, 40);
					String wynik5 = data.substring(41, 44);
					String wynik6 = data.substring(44, 47);

					System.out.println(data.substring(3, 6) + "�identyfikator nag��wka");
					if (data.substring(9, 10).equals("1")) {
						JOptionPane.showMessageDialog(null,
								"Automatyczny wyb�r pozycji: " + wynik1 + " brak ustalonej pozycji z tego satelity");
						System.out.println(
								"Automatyczny wyb�r pozycji: " + wynik1 + " brak ustalonej pozycji z tego satelity");
					} else if (data.substring(9, 10).equals("2")) {
						JOptionPane.showMessageDialog(null, "Automatyczny wyb�r pozycji: " + wynik1 + " pozycja 2D");
						System.out.println("Automatyczny wyb�r pozycji: " + wynik1 + " pozycja 2D");
					} else if (data.substring(9, 10).equals("3")) {
						JOptionPane.showMessageDialog(null, "Automatyczny wyb�r pozycji: " + wynik1 + " pozycja 3D");
						System.out.println("Automatyczny wyb�r pozycji: " + wynik1 + " pozycja 3D");
					}
					JOptionPane.showMessageDialog(null,
							"numery satelit�w wykorzystane do wyznaczenia pozycji: " + wynik2);
					JOptionPane.showMessageDialog(null,
							"DOP (dilution of precision) � precyzja wyznaczonej pozycji: " + wynik3);
					JOptionPane.showMessageDialog(null,
							"HDOP (horizontal dilution of precision) � horyzontalna precyzja wyznaczonej pozycj: "
									+ wynik4);
					JOptionPane.showMessageDialog(null,
							"VDOP (vertical dilution of precision) � wertykalna precyzja wyznaczonej pozycji: "
									+ wynik5);
					JOptionPane.showMessageDialog(null, "Suma kontrolna: " + wynik6);

					System.out.println("numery satelit�w wykorzystane do wyznaczenia pozycji: " + wynik2);
					System.out.println("DOP (dilution of precision) � precyzja wyznaczonej pozycji: " + wynik3);
					System.out.println(
							"HDOP (horizontal dilution of precision) � horyzontalna precyzja wyznaczonej pozycj: "
									+ wynik4);
					System.out
							.println("VDOP (vertical dilution of precision) � wertykalna precyzja wyznaczonej pozycji: "
									+ wynik5);
					System.out.println("Suma kontrolna: " + wynik6);
				} else if (data.substring(3, 6).equals("GSV")) {
					// $GPGSV,2,1,08,01,40,083,46,02,17,308,41,12,07,344,39,14,22,228,45*75

					String wynik2 = data.substring(7, 8);
					String wynik3 = data.substring(9, 10);
					String wynik4 = data.substring(11, 13);
					String wynik5 = data.substring(14, 16);
					String wynik6 = data.substring(17, 19);
					String wynik7 = data.substring(20, 23);
					String wynik8 = data.substring(24, 26);
					String wynik9 = data.substring(27, 65);
					String wynik10 = data.substring(65, 68);

					// System.out.println(wynik9);
					JOptionPane.showMessageDialog(null, data.substring(3, 6) + "�identyfikator nag��wka");
					JOptionPane.showMessageDialog(null, "Liczba lini: " + wynik2);
					JOptionPane.showMessageDialog(null, "Aktualny numer linii : " + wynik3);
					JOptionPane.showMessageDialog(null, "Liczba aktualnie widocznych satelit�w : " + wynik4);
					JOptionPane.showMessageDialog(null, "Identyfikator PRN satelity : " + wynik5);
					JOptionPane.showMessageDialog(null,
							"Wyniesienie satelity nad poziom r�wnika (stopnie) : " + wynik6);
					JOptionPane.showMessageDialog(null, "Azymut satelity (stopnie) : " + wynik7);
					JOptionPane.showMessageDialog(null,
							"SNR (signal to noise ratio) � poziom odbieranego sygna�u : " + wynik8);
					JOptionPane.showMessageDialog(null, "Informacje o kolejnych satelitach : " + wynik9);
					JOptionPane.showMessageDialog(null, "Suma kontrolna : " + wynik10);

					System.out.println(data.substring(3, 6) + "�identyfikator nag��wka");
					System.out.println("Liczba lini: " + wynik2);
					System.out.println("Aktualny numer linii : " + wynik3);
					System.out.println("Liczba aktualnie widocznych satelit�w : " + wynik4);
					System.out.println("Identyfikator PRN satelity : " + wynik5);
					System.out.println("Wyniesienie satelity nad poziom r�wnika (stopnie) : " + wynik6);
					System.out.println("Azymut satelity (stopnie) : " + wynik7);
					System.out.println("SNR (signal to noise ratio) � poziom odbieranego sygna�u : " + wynik8);
					System.out.println("Informacje o kolejnych satelitach : " + wynik9);
					System.out.println("Suma kontrolna : " + wynik10);
				} else if (data.substring(3, 6).equals("RMC")) {

					// $GPRMC,123519,A,4807.038,N,01131.000,E,022.4,084.4,230394,003.1,W*6A
					String wynik1 = data.substring(14, 15);
					// Szeroko�c
					String wynik2 = data.substring(16, 18);
					String wynik3 = data.substring(18, 24);
					String wynik4 = data.substring(25, 26);

					// D�ugo��
					String wynik5 = data.substring(27, 30);
					String wynik6 = data.substring(30, 36);
					String wynik7 = data.substring(37, 38);

					String wynik8 = data.substring(39, 44);
					String wynik9 = data.substring(45, 50);

					// Data
					String wynik12 = data.substring(51, 53);
					String wynik13 = data.substring(53, 55);
					String wynik14 = data.substring(55, 57);
					int wynik15 = Integer.parseInt(wynik14);
					// System.out.println(wynik14);

					String wynik10 = data.substring(58, 65);
					String wynik11 = data.substring(65, 68);

					JOptionPane.showMessageDialog(null, data.substring(3, 6) + "�identyfikator nag��wka");
					JOptionPane.showMessageDialog(null,
							data.substring(7, 13) + " Aktualny Czas: " + data.substring(7, 9) + ":"
									+ data.substring(9, 11) + ":" + data.substring(11, 13) + " UTC");

					System.out.println(data.substring(3, 6) + "�identyfikator nag��wka");
					System.out.println(data.substring(7, 13) + " Aktualny Czas: " + data.substring(7, 9) + ":"
							+ data.substring(9, 11) + ":" + data.substring(11, 13) + " UTC");
					if (wynik1.equals("A")) {
						JOptionPane.showMessageDialog(null, "Status " + wynik1 + " aktywny");
						System.out.println("Status " + wynik1 + " aktywny");
					} else if (wynik1.equals("V")) {
						JOptionPane.showMessageDialog(null, "Status " + wynik1 + " nieaktywny");
						System.out.println("Status " + wynik1 + " nieaktywny");
					}
					JOptionPane.showMessageDialog(null,
							"Szeroko�� geograficzna (latitude) - " + wynik2 + " deg " + wynik3 + "' " + wynik4);
					JOptionPane.showMessageDialog(null,
							"D�ugo�� geograficzna (longitude) - " + wynik5 + " deg " + wynik6 + "' " + wynik7);
					JOptionPane.showMessageDialog(null, "Pr�dko�� obiektu (liczona w w�z�ach): " + wynik8);
					JOptionPane.showMessageDialog(null,
							"K�t �ledzenia/poruszania si� obiektu (w stopniach): " + wynik9);

					System.out.println(
							"Szeroko�� geograficzna (latitude) - " + wynik2 + " deg " + wynik3 + "' " + wynik4);
					System.out
							.println("D�ugo�� geograficzna (longitude) - " + wynik5 + " deg " + wynik6 + "' " + wynik7);
					System.out.println("Pr�dko�� obiektu (liczona w w�z�ach): " + wynik8);
					System.out.println("K�t �ledzenia/poruszania si� obiektu (w stopniach): " + wynik9);

					if (wynik13.equals("01")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " stycze� 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " stycze� 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " stycze� 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " stycze� 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("02")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " luty 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " luty 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " luty 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " luty 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("03")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " marzec 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " marzec 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " marzec 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " marzec 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("04")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " kwiecie� 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " kwiecie� 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " kwiecie� 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " kwiecie� 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("05")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " maj 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " maj 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " maj 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " maj 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("06")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " czerwiec 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " czerwiec 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " czerwiec 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " czerwiec 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("07")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " lipiec 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " lipiec 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " lipiec 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " lipiec 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("08")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " sierpie� 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " sierpie� 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " sierpie� 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " sierpie� 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("09")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " wrzesie� 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " wrzesie� 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " wrzesie� 20" + wynik14 + ")");

							System.out.println("Data: (" + wynik12 + " wrzesie� 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("10")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null,
									"Data: (" + wynik12 + " pa�dziernik 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " pa�dziernik 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null,
									"Data: (" + wynik12 + " pa�dziernik 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " pa�dziernik 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("11")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " lisptopad 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " lisptopad 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " listopad 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " listopad 20" + wynik14 + ")");
						}
					} else if (wynik13.equals("12")) {
						if (wynik15 >= 50) {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " grudzie� 19" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " grudzie� 19" + wynik14 + ")");
						} else {
							JOptionPane.showMessageDialog(null, "Data: (" + wynik12 + " grudzie� 20" + wynik14 + ")");
							System.out.println("Data: (" + wynik12 + " grudzie� 20" + wynik14 + ")");

						}
					}
					JOptionPane.showMessageDialog(null, "Odchylenie magnetyczne ziemi: " + wynik10);
					JOptionPane.showMessageDialog(null, "Suma kontrolna: " + wynik11);

					System.out.println("Odchylenie magnetyczne ziemi: " + wynik10);
					System.out.println("Suma kontrolna: " + wynik11);
				} else if (data.substring(3, 6).equals("VTG")) {
					// $GPVTG,054.7,T,034.4,M,005.5,N,010.2,K*33

					String wynik1 = data.substring(7, 14);
					String wynik2 = data.substring(15, 22);
					String wynik3 = data.substring(23, 30);
					String wynik4 = data.substring(31, 38);
					String wynik5 = data.substring(38, 41);

					JOptionPane.showMessageDialog(null, data.substring(3, 6) + "�identyfikator nag��wka");
					JOptionPane.showMessageDialog(null, "�cie�ka poruszania si� (w stopniach): " + wynik1);
					JOptionPane.showMessageDialog(null,
							"�cie�ka   poruszania   si�   na   podstawie wsp�rz�dnych magnetycznych � w stopniach: "
									+ wynik2);
					JOptionPane.showMessageDialog(null, "Pr�dko�� w w�z�ach: " + wynik3);
					JOptionPane.showMessageDialog(null, "Pr�dko�� w km/h: " + wynik4);
					JOptionPane.showMessageDialog(null, "Suma kontrolna: " + wynik5);

					System.out.println(data.substring(3, 6) + "�identyfikator nag��wka");
					System.out.println("�cie�ka poruszania si� (w stopniach): " + wynik1);
					System.out.println(
							"�cie�ka   poruszania   si�   na   podstawie wsp�rz�dnych magnetycznych � w stopniach: "
									+ wynik2);
					System.out.println("Pr�dko�� w w�z�ach: " + wynik3);
					System.out.println("Pr�dko�� w km/h: " + wynik4);
					System.out.println("Suma kontrolna: " + wynik5);
				} else {
					JOptionPane.showMessageDialog(null, "Dane s� nieobs�ugiwane");
					System.out.println("Dane s� nieobs�ugiwane");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Za du�y rozmiar");
				System.out.println("Za du�y rozmiar");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Nieprawdi�owe");
			System.out.println("Nieprawdi�owe");
		}

	}

}
