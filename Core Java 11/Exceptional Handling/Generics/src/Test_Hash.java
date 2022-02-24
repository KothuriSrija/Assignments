import java.util.HashSet;
import java.util.Set;
class Employees
{
	int empid,empSalary;
	String empName,empDept;
	public Employees(int empid,String empName, int empSalary, String empDept)
	{
		super();
		this.empid=empid;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empDept=empDept;
	}
	

	public String toString() {
		return "Employees [empid=" + empid + ", empSalary=" + empSalary + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
}


public class Test_Hash {
	public static void main(String[] args)
	{
		Employees e1=new Employees(101,"Pink",50000,"Finance");
		Employees e2=new Employees(102,"Blue",45000,"IT");
		Employees e3=new Employees(103,"Green",55000,"Tax");
		Set<Employees> employees= new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		for (Employees employees2 : employees) {
			System.out.println(employees2);
			
		}
	}
}