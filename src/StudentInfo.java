import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int studentNum = 0;
		String[] studentNames = { "Michael Chan", "Yasmin Rodriguez", "Pratima Kaza", "Samuel Bernardy", "Marcus Perez",
				"Tim Johnson", "Jenna Price", "Siddique Khatri", "Joe Garza", "Alex Cyr", "Matthew Davis" };
		String[] studentHometowns = { "Rochester, MI", "Ann Arbor, MI", "Edingburg, TX", "Livonia, Mi", "Adrian, MI",
				"Los Angeles, CA", "Lander, WY", "Troy, MI", "Inkster, MI", "Farmington, MI", "St. Clair Shores" };
		String[] nicknames = { "Pooky", "Yazzy", "P-nasty", "S-Dog", "Masta P", "T-Dog", "Juice", "Siddid", "Big Joe",
				"Alpha", "Mazzy" };
		String[] favoriteFoods = { "Sushi", "Indian", "Indian", "Human Flesh", "Fruit", "Ethnic", "Thai", "Indian",
				"Mexican", "Cheeseburgers", "Hibachi" };

		System.out.println("Welcome to our Java class.");
		System.out.print(
				"Which student would you like to know more about? (enter a number 1-" + studentNames.length + "): ");
		System.out.println();
		String choice = "y";

		while (!choice.equalsIgnoreCase("q")) {
			try {
				if (Character.isDigit(choice.charAt(0))) {
					studentNum = Integer.parseInt(choice);
				} else {
					studentNum = scnr.nextInt();
					scnr.nextLine();

				}
				String firstName = studentNames[studentNum].split(" ")[0];
				System.out.print("Student " + studentNum + " is " + studentNames[studentNum] + ". ");
				System.out.println();

				String moreInfo = "y";
				while (moreInfo.equalsIgnoreCase("y")) {
					
					System.out.print("What would you like to know about " + firstName + "? (enter \"hometown\","
							+ " \"nickname\", or \"favorite food\"): ");
					String query = scnr.nextLine();
					
					if (query.equalsIgnoreCase("hometown")) {
						System.out.println(firstName + " is from " + studentHometowns[studentNum] + ".");
						System.out.println();


					}
					else if (query.equalsIgnoreCase("nickname")) {
						System.out.println(firstName + " goes by " + nicknames[studentNum] + ".");
						System.out.println();


					}
					else if (query.equalsIgnoreCase("favorite food")) {
						System.out.println(firstName + " likes to eat " + favoriteFoods[studentNum] + ".");
						System.out.println();


					}
					else {
						System.out.print("Invalid entry. ");
						continue;
					}
					System.out
							.println("Would you like to know more about " + firstName + "? (enter \"yes\" or \"no\")");
					moreInfo = String.valueOf(scnr.nextLine().charAt(0));
					System.out.println();
				}
				System.out.println("Choose another student (1 - " + studentNames.length
						+ ") to learn more about, or type q to quit.");
				choice = scnr.nextLine();

			} catch (IndexOutOfBoundsException e) {
				System.out.println("That student does not exist. Please try again. (enter a number 1-"
						+ studentNames.length + ")");

			} catch (Exception e) {
				System.out.println("That data does not exist. Please try again.");
				scnr.nextLine();
				continue;
			}
		}
		System.out.println("Program terminated.");

	}

}
