package java8features;

public class Lambdaa2 {
	public static void main(String[] args)
	{
	//	public void draw() {
		//	System.out.println("this is the draw method");
		//}
		//Drawable dd=new drawable();
		//dd.draw();
		
		 int a=10;
		 String str="Mohan";
		 Show2 s2=()->
		 {
			 System.out.println("this is the show number:"+a);
			 System.out.println("this is the show number:"+str);
			 
		 };
		 s2.ram();
		 
		 
		 //Show2 s1=name->
		 //{
			// System.out.println("this is the show number:"+a);
			// return "This is rammohan"+name;
			 
		 //};
		// System.out.print(s1.Sm("ram"));
		
	}

}
