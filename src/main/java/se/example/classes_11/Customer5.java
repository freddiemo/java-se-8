package se.example.classes_11;

public class Customer5 {
	private String name;
	private Double creditLimit;
	private String email;

	public Customer5(String name, Double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public Customer5() {
		this("Nobody", "nobody@nowhere.com");
	}

	public Customer5(String name, String email) {
		this(name, 1000d, email);
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}

}