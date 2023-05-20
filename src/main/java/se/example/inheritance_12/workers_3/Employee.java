package se.example.inheritance_12.workers_3;

public class Employee extends Worker {
	protected long employeeId;
	protected String hireDate;
	private static int employeeNo = 1;

	public Employee(){}

	public Employee(String name, String birthDate, String hireDate){
		super(name, birthDate);
		this.employeeId = Employee.employeeNo++;
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"employeeId=" + employeeId +
				", hireDate='" + hireDate + '\'' +
				"} " + super.toString();
 	}
}