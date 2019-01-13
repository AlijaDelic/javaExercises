package strings;
import java.time.LocalDate;
import java.time.format.*;
import java.util.Locale;

public class Person {
	String firstName;
	String lastName;
	LocalDate birthDate;
	String birthPlace;

	public Person(String firstName, String lastName, LocalDate birthDate, String birthPlace) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.birthPlace = birthPlace;
			this.birthDate = birthDate;
	}
	
	public String manageBirthDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern
				(
				"dd. MMM yyyy.", 
				Locale.forLanguageTag("sr-Latn-RS")
				);
		return this.birthDate.format(formatter);
	}

	public String toString () {
		return("Firstname:" + this.firstName + 
				", lastname: " + this.lastName + 
				", birthdate: " + this.manageBirthDate()  +
				", birthplace: " + this.birthPlace + ".");
	}
}
