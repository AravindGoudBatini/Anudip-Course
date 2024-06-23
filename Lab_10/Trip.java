package Lab_10;

import java.util.Scanner;

class HillStation {
	public void location() {
		System.out.println(" present located in Shivalik hills");
	}

	public void famousFor() {
		System.out.println("Mesmerizing beauty of nature");
	}
}

class Manali extends HillStation {

	@Override
	public void location() {

		super.location();
		System.out.println("Manali climate is cool");
	}

	@Override
	public void famousFor() {
		System.out.println(" grandees of snow-capped mountain");
		super.famousFor();
	}

}

class Mussoorie extends HillStation {

	@Override
	public void location() {
		System.out.println("located at uttranchale MUSSOORIES RANGE");
		super.location();
	}

	@Override
	public void famousFor() {
		System.out.println("scenic beauty, good social life and Tasty food");
		super.famousFor();
	}

}

class Gulmarg extends HillStation {

	@Override
	public void location() {
		System.out.println(" Gulmarg located in  Kashmir Valley");
		super.location();
	}

	@Override
	public void famousFor() {
		System.out.println(" magical nature and cable car");
		super.famousFor();
	}

}

public class Trip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the hill station (Manali/Mussoorie/Gulmarg):");
		String choice = scanner.nextLine().toLowerCase();

		HillStation hillStation;
		switch (choice) {
		case "manali":
			hillStation = new Manali();
			break;
		case "mussoorie":
			hillStation = new Mussoorie();
			break;
		case "gulmarg":
			hillStation = new Gulmarg();
			break;
		default:
			System.out.println("enter valid choice!");
			return;
		}

		hillStation.location();
		hillStation.famousFor();
	}

}

