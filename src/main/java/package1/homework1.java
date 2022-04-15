package package1;

public class homework1 {

	public static void bikeCondition(int a)
	{
		if (a == 120 || a == 170 || a == 180 || a == 185 || a == 400) {
			
			System.out.println("Your bike need repair");

		} else {
			System.out.println("You bike is in good condition");

		}
	}

	public static void printName() {

		String[] name = new String[] { "Teja", "Srija", "Kaushali", "Naresh", "Kavya" };

		for (int i = 0; i <= name.length - 1; i++) {
			System.out.println(name[i]);
		}

		// for (String str : name) { System.out.println(str); }

	}

	public static void numberToSpanish(int num) {
		String spanishString;
		switch (num) {
		case 1:
			spanishString = "uno";
			break;
		case 2:
			spanishString = "dos";
			break;
		case 3:
			spanishString = "tres";
			break;
		case 4:
			spanishString = "cuatro";
			break;
		case 5:
			spanishString = "cinco";
			break;
		case 6:
			spanishString = "seis";
			break;
		case 7:
			spanishString = "siete";
			break;
		case 8:
			spanishString = "ocho";
			break;
		case 9:
			spanishString = "nueve";
			break;
		case 10:
			spanishString = "diez";
			break;

		default:
			spanishString = "Invalid number";
			break;
		}
		System.out.println(spanishString);
	}

	public static void printnumber(int a) {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
			if (i == a) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bikeCondition(120);
		System.out.println();
		printName();
		System.out.println();
		numberToSpanish(3);
		System.out.println();
		printnumber(100);
	}

}
