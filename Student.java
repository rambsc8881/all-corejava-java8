package Student;

public class Student extends Object{
int id;
String name;
String address;
public Student(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "StudentBase [id=" + id + ", name=" + name + ", address=" + address + "]";
}
@Override
public int hashCode()
{
	final int prime=7;
	int result=1;
	result=prime+((name==null)?0:name.hashCode());
	result=prime+((address==null)?0:address.hashCode());
	return result; 
	
}

@Override
public boolean equals(Object obj)
{
	if(this ==obj)
	return true;
	if(obj==null)
	return false;
	if(getClass()!=obj.getClass()||(obj==null))
		return false;
	Student other = (Student) obj;
	if(name==null)
	{
		if(other.name!=null)
			return false;
		
	}else if(!name.equals(other.name))
		return false;
	if(address==null)
	{
		if(other.address!=null)
			return false;
	}else if(!address.equals(address))
		return false;
	return true;
}
}

