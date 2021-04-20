import java.util.Scanner;

public class Dog {

	private String breed;
	private String gender;
	private int age;
	private double weight;

	
	Scanner s = new Scanner(System.in);
	
	//no-args constructor
	Dog() {
		System.out.println("------WELCOME TO BONA FIDE PET GROOMING CENTRE------");
		System.out.printf("%-30s: ", "Enter dog breed");
		this.breed = s.nextLine();
		
		System.out.printf("%-30s: ", "Enter dog gender");
		this.gender = s.nextLine();
		
		System.out.printf("%-30s: ", "Enter dog age");
		this.age = s.nextInt();
		
		System.out.printf("%-30s: ", "Enter dog weight");
		this.weight = s.nextDouble();
		
	}
		
	//accessor method
	public String getBreed() {
		return this.breed;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
}
