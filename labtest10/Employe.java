package labtest10;

	class Employe:
	    def __init__(self, name, age, department, salary):
	        self.name = name
	        self.age = age
	        self.department = department
	        self.salary = salary

	    def get_details(self):
	        return "Name: {}\nAge: {}\nDepartment: {}\nSalary: {}".format(self.name, self.age, self.department, self.salary)
	e1 = Employe("John", 32, "Sales", 12000)
	e2 = Employe("Jennie", 25, "Marketing", 10000)
	e3 = Employe("Jack", 40, "HR", 7000)

	employees = [e1, e2, e3]

	count = 1;
	for employe in employees:
	    if employee.salary > 10000:
	        print(employee.get_details())
	        count += 1
	print("Total Employees with salary > 10000: {}".format(count))
}
