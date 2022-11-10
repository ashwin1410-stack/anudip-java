import java.util.*;
 package labtest10;
public class Employee {

	String name;
	int age;
	String department;
	int salary;
	public Employee(String name,int age,String department,int salary)
		{	
			this.name=name;
			this.age=age;
			this.department=department;
			this.salary=salary;
		}
		public void display()
		{
			System.out.println("Name : "+name+" Age : "+age+" Department : "+department+" Salary : "+salary);
		}

	}

	{
		public static void main(String args[])
		{
			ArrayList<Employee> list=new ArrayList<Employee>();
			list.add(new Employee("Ashwin",34,"Computer",1000));
			list.add(new Employee("virat",45,"Chemical",1500));
			list.add(list);
