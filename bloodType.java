import java.util.*;

public class bloodType {

	public static void main (String[]args) {
		Scanner kb = new Scanner (System.in);

		int answer;
		String bloodType;

		System.out.println("Please provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): ");
		bloodType = kb.nextLine();
		if (bloodType.equals("A+") || bloodType.equals("O+") || bloodType.equals("B+") || bloodType.equals("AB+") || bloodType.equals("A-") || bloodType.equals("O-") || bloodType.equals("B-") || bloodType.equals("AB-")){
			System.out.println("Do you want to know about giving or receiving (1 for giving, 2 for receiving): ");
		} else System.out.println("Blood type doesn't exist, please try again." );
		 


		answer = kb.nextInt();
		switch (answer) {
		case 1:

			if (bloodType.equals("A+")){
				System.out.println("You can give to: A+, AB+");
			}if (bloodType.equals("O+")){
				System.out.println("You can give to: O+, A+, B+, AB+ ");
			}if (bloodType.equals("B+")){
				System.out.println("You can give to: B+, AB+");
			}if (bloodType.equals("AB+")){
				System.out.println("You can give to: AB+");
			}if (bloodType.equals("A-")){
				System.out.println("You can give to: A+, A-, AB+, AB-");
			}if (bloodType.equals("O-")) {
				System.out.println("You can give to: everyone");
			}if (bloodType.equals("B-")) {
				System.out.println("You can give to: B+, B-, AB+, AB-");
			}if (bloodType.equals("AB-")) {
				System.out.println("You can give to: AB+, AB-");
			}break;
		case 2:

			if (bloodType.equals("A+")){
				System.out.println("You can receive from: A+, A-, O+, O-");
			}if (bloodType.equals("O+")){
				System.out.println("You can receive from: O+, O-");
			}if (bloodType.equals("B+")){
				System.out.println("You can receive from: B+, B-, O+, O-");
			}if (bloodType.equals("AB+")){
				System.out.println("You can receive from: everyone");
			}if (bloodType.equals("A-")){
				System.out.println("You can receive from: A-, O-");
			}if (bloodType.equals("O-")) {
				System.out.println("You can receive from: O-");
			}if (bloodType.equals("B-")) {
				System.out.println("You can receive from: B-, O-");
			}if (bloodType.equals("AB-")) {
				System.out.println("You can receive from: AB-, A-, B-, O-");
			}break;
		default:
			System.out.println("invalid input, try again");
			bloodType = kb.nextLine();

		}

	}
}

//I LOVE POTATO!!!
