package Taller;


public class cart {
	String suit, name;
	int points;

	cart(int n1, int n2) {
		suit = getSuit(n1);
		name = getName(n2);
		points = getPoints(name);
	}

	public String toString() {
		return "The " + name + " of " + suit;
	}

	public String getName(int i) {
		if (i == 1)
			return "uno";
		if (i == 2)
			return "dos";
		if (i == 3)
			return "tres";
		if (i == 4)
			return "cuatro";
		if (i == 5)
			return "cinco";
		if (i == 6)
			return "sies";
		if (i == 7)
			return "siete";
		if (i == 8)
			return "ocho";
		if (i == 9)
			return "nueve";
		if (i == 10)
			return "diez";
		if (i == 11)
			return "once";
		if (i == 12)
			return "doce";
		if (i == 13)
			return "trece";
		return "error";
	}

	public int getPoints(String n) {
		if (n == "Jack" || n == "reina" || n == "rey" || n == "10")
			return 10;
		if (n == "dos")
			return 2;
		if (n == "tres")
			return 3;
		if (n == "cuatro")
			return 4;
		if (n == "cinco")
			return 5;
		if (n == "seis")
			return 6;
		if (n == "siete")
			return 7;
		if (n == "ocho")
			return 8;

		if (n == "9")
			return 9;
		if (n == "uno")
			return 1;
		return -1;
	}

	public String getSuit(int i) {
		if (i == 1)
			return "dimante";
		if (i == 2)
			return "trebol";
		if (i == 3)
			return "espadas";
		if (i == 4)
			return "espadas";
		return "error";
	}
}
