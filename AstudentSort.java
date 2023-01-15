package Student;

import java.util.HashSet;

public class AstudentSort {
public static void main(String[] rags)
{
	Student s1=new Student(101,"ram","chennai");
	Student s2=new Student(102,"ram","chennai");
	Student s3=new Student(103,"ram","hyd");
	Student s4=new Student(104,"siva","hyd");
	
//	System.out.println(s1.equals(2));
	
HashSet<Student> objectset=new HashSet<Student>();
objectset.add(s1);
objectset.add(s2);
objectset.add(s3);
objectset.add(s4);
for(Student st:objectset)
{
	System.out.println("id:" + st.getId()+ " name:" +st.getName()+ " address:"+ st.getAddress());
}
}
}
