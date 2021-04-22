

import java.util.ArrayList;

public class Examples {

	public static void main(String[] args) {

		Person p = new Person("Molly", "10/15");
		Student s = new Student("Amy", "4/28", 3.9, "Band, Computer Science");
		printName(p);
		printName(s);

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Molly", "10/15"));
		list.add(new Student("Amy", "4/28", 3.9, "CS, Art"));
		list.add(new Student("Micah", "10/15", 3.7, "CS, Gym"));
		list.add(new Person("Carrie", "06/22"));

		for (Person per : list) {
			System.out.println(per);
		}

	}

	public static void printName(Person p) {
		System.out.println(p.getName());
	}

}
