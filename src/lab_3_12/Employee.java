package lab_3_12;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String firstName, middleInitial, lastName;
	private LocalDate birthDate;
	private String SSN;
	private double salary;
	
	public Employee(int employeeId, String firstName, String miggleInitial, String lastName, LocalDate birthDate,
			String SSN, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = miggleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.SSN = SSN;
		this.salary = salary;
	}
	
	public String print(){
		return String.format("     id:%d. %s %s %s, birthdate: %s, SSN:%s, Salary: $%.2f", employeeId, firstName, middleInitial, lastName, birthDate, SSN, salary);	
	}
	
	public double getSalary(){
		return salary;
	}
}
