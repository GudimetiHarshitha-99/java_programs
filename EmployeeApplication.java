package module2_Strings;

public class EmployeeApplication {

	public static void main(String[] args) {
//		Employee e=new Employee("Harsha",15,"Developer");
		Employee e1=new Employee(50000);
//		e.display();
		e1.display();
		
	}
}
class Employee
{
	String name,Designation;
	int id,salary;
	Employee(String name,int id,String Designation)
	{
		this.name=name;
		this.id=id;
		this.Designation=Designation;
	}
	Employee(int salary)
	{
		this("Harshi",30,"Trainer");
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Name is "+name+"\n"+"Id is "+id+"\n"+"Designation is "+Designation+"\n"+"Salary is "+salary+"\n");
	}
}