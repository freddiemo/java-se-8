package se.example.inheritance_12.workers_3;

public class Worker {
	private String name;
	private String birthDate;
	protected String endDate;

	public Worker(){}

	public Worker(String name, String birthDate){
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getAge() {
		int currentYear = 2023;
		int birthYear = Integer.parseInt(birthDate.substring(6));

		return (currentYear - birthYear);
	}

	public double collectPay(){
		return 0d;
	}

	public void terminate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Workder{" +
				"name='" + name + '\'' +
				", birthDate='" + birthDate + '\'' +
				", endDate='" + endDate + '\'' +
				'}';
 	}
}