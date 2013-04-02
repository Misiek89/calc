import java.util.Scanner;

public class calc {

	public static boolean isDouble(String value_) {
		try {
			double x = Double.parseDouble(value_);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public static double takeDouble(String text_) {
		Scanner in = new Scanner(System.in);
		System.out.print(text_);
		String result = in.next();
		if (calc.isDouble(result))
			return Double.parseDouble(result);
		else
			return 0;
	}

	public static boolean isInt(String value_) {
		try {
			int x = Integer.parseInt(value_);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public static int takeInt(String text_) {
		Scanner in = new Scanner(System.in);
		System.out.print(text_);
		String result = in.next();
		if (calc.isInt(result))
			return Integer.parseInt(result);
		else
			return 0;
	}

	public static void main(String[] args) {
		double op = 0, num1 = 0, num2 = 0;
		int num = 0;

		System.out.println("*** Calc v1.0 ***\n");
		do {
			System.out.println("\nWybierz rodzaj operacji");
			System.out.println("1. Dodawanie");
			System.out.println("2. Odejmowanie");
			System.out.println("3. Mnozenie");
			System.out.println("4. Dzielenie");
			System.out.println("5. KONIEC");
			num = calc.takeInt("Podaj numer i naciœnij ENTER:");

			switch (num) {
			case 1:
				num1 = calc.takeDouble("Podaj pierwsza liczbe:");
				num2 = calc.takeDouble("Podaj druga liczbe:");
				System.out.println("Wynik dodawania to:" + (num1 + num2) + "\n");
				break;
			case 2:
				num1 = calc.takeDouble("Podaj pierwsza liczbe:");
				num2 = calc.takeDouble("Podaj druga liczbê:");
				System.out.println("Wynik odejmowania to:" + (num1 - num2) + "\n");
				break;
			case 3:
				num1 = calc.takeDouble("Podaj pierwsza liczbe:");
				num2 = calc.takeDouble("Podaj druga liczbe:");
				System.out.println("Wynik mno¿enia to:" + (num1 * num2) + "\n");
				break;
			case 4:
				num1 = calc.takeDouble("Podaj pierwsza liczbe:");
				num2 = calc.takeDouble("Podaj druga liczbe:");
				if (num2 == 0) {
					System.out.println("Nie mozna dzielic przez 0!\n");
					break;
				} else
					System.out.println("Wynik dzielenia to:" + (num1 / num2) + "\n");
				break;
			case 5:
				new Scanner(System.in).close();
				System.out.println("Koniec programu\n");
				System.exit(0);

			default:
				System.out.println("Bledny wybor!\n");
			}
		} while (true);
	}
}