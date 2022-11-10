package labtest10;
	class Employee:
	    def __init__(self,name,age,department,salary):
	        self.name=name
	        self.age=age
	        self.department=department
	        self.salary=salary

	    def get_employee(self):
	        return self.name

	emp1=Employee("A",21,"CS",30000)
	emp2=Employee("B",22,"ECE",40000)
	emp3=Employee("C",23,"IT",50000)

	if emp1.salary > emp2.salary and emp1.salary > emp3.salary:
	    print(emp1.get_employee())
	elif emp2.salary > emp1.salary and emp2.salary > emp3.salary:
	    print(emp2.get_employee())
	else:
	    print(emp3.get_employee())
}
}