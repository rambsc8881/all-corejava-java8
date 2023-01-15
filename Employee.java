package Student;

public class Employee {
	int id;
	String name;
	String addrs;
	int salary;
	public Employee(int id, String name, String addrs,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addrs=" + addrs + ",salary="+salary+"]";
	}
	

}
