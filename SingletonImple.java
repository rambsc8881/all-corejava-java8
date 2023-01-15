package java8features;

public class SingletonImple {
	
public static void main(String[] args)
{
	SingleTon init=SingleTon.getInstance();
	SingleTon init1=SingleTon.getInstance();
	SingleTon init2=SingleTon.getInstance();
	
	init.showMessage();
	init.showMeaage2();
	System.out.println(init1);
	System.out.println(init);
	System.out.println(init2);
	//SingleTon init=new SingleTon();
	//init.showMeaage2();
}
}
