package oopsconcepts;

public class ImplAbstractexample  extends Abstrtxample{
	public static void main(String[] args)
	{
		Abstrtxample.statiC();
		
		//new Abstrtxample.nonStatic();
		
		Abstrtxample lm=new ImplAbstractexample();
		lm.abStract();
		lm.nonStatic();
		
		
	}

	@Override
	public void abStract() {
		System.out.println("this is overriden method");
		
	}

}

