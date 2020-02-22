package Employee;

public class Employee{
	private String name ;
	private int id ;
	private double salary ;
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	} 
	
	
	public void showinfo() {
		System.out.println(name+":"+id+":"+salary);
	
	}
	
	
}
