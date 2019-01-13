package strings;
import java.time.LocalDate;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
		String[] arr = text.split(" ");
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		for(String str: arr) {
			String[] data = str.split("[./]");
			String firstName = null, lastName = null, birthPlace = null;
			LocalDate birthDate = null;
			
			for(int i=0; i<data.length; i++) {
				firstName = data[0];
				lastName = data[1];
				
				int day =  Integer.parseInt(data[2].substring(0, 2));
				int month = Integer.parseInt(data[2].substring(2, 4));
				int year =  Integer.parseInt(data[2].substring(4, 8));
				
				birthDate = LocalDate.of(year, month, day);
				
				birthPlace = data[3];
			}

			Person person = new Person(firstName, lastName, birthDate, birthPlace );
			persons.add(person);
			
		}
		
		for(Person person : persons) {
			System.out.println(person.toString());
		}
		
	}

}
