
class Member{
	public String Name;
	public int age;
	public long phno;
	public String address;
	public int salary;

	public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member {
	public String specialization;
	
	public void setEmployee(String name, int age, long phno , String address, int salary, String spec) {
		this.Name = name;
		this.age = age;
		this.phno = phno;
		this.address  =address;
		this.salary = salary;
		this.specialization = spec;
	}

	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", Name=" + Name + ", age=" + age + ", phno=" + phno
				+ ", address=" + address + ", salary=" + salary + "]";
	}
	

	
}
class Manager extends Member{
	public String department;
	public void setManager(String name, int age, long phno , String address, int salary, String depart) {
		this.Name = name;
		this.age = age;
		this.phno = phno;
		this.address  =address;
		this.salary = salary;
		this.department = depart;
	}
	@Override
	public String toString() {
		return "Manager [department=" + department + ", Name=" + Name + ", age=" + age + ", phno=" + phno + ", address="
				+ address + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp =new Employee();
		emp.setEmployee("Bob", 23, 7576384767l, "MindSpace", 33000, "IT");
		
		Manager mt = new Manager();
		mt.setManager("John", 35, 7652734872l, "DLF", 55000, "Network");
		
		System.out.println(emp.toString());
		System.out.println(mt.toString());

	}

}
