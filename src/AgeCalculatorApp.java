import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Age Calculator\n");

		LocalDate currentDate = LocalDate.now();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your date of birth (YYYY-MM-DD): ");
		String dateOfBirthString = sc.nextLine();
		System.out.println();

		LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);

		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

		System.out.println("Your date of birth is " + dtf.format(dateOfBirth));

		System.out.println("The current date is " + dtf.format(currentDate));

		long Age = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
		System.out.println("Your age is " + Age);
	}
}