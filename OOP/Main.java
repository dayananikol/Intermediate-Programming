package oop;

public class Main {

	public static void main (String[] args) {

		
		
		Person x = new Person ("Alex", "Male", 66.8, 2);
		Person y = new Person ("David", "Male", 78, 8);
		Person z = new Person ("OtherPeople", "Female", 56, 3);
		
		System.out.println("Name: " + x.name + "\n" + "Gender: " + x.gender + "\n" + "Weight: " + x.weight + "\n" + "Number of jowa: " + x.jowa + "\n");
		System.out.println("Name: " + y.name + "\n" + "Gender: " + y.gender + "\n" + "Weight: " + y.weight + "\n" + "Number of jowa: " + y.jowa + "\n");
		System.out.println("Name: " + z.name + "\n" + "Gender: " + y.gender + "\n" + "Weight: " + y.weight + "\n" + "Number of jowa: " + y.jowa + "\n");
	}

}
