package Member;

public class Employe extends Member{
	//additional data member of employee class
	String specialization;
	//default constructor
	public Employe() {
		super();
		
	}
    //Parameterized constructor
	public Employe(String name, int age, String contact, String address, String Salary) {
		super(name, age, contact, address, Salary);
	}
	//method to display information of employee
	void displayempInfo() {
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("contact:"+contact);
	System.out.println("address:"+address);
	System.out.println("Specialization:"+specialization);
	System.out.println("Salary:"+printSalary());
}
}
