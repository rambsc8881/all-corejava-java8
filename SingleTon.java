package java8features;

class SingleTon {
	
	private static SingleTon instance=new SingleTon();
	
	private SingleTon()
	{
	}
		public static SingleTon getInstance()
		{
			//instance=new SingleTon();
			return instance;
		}
		 void showMessage()
		{
			System.out.println("This is the single ton method");
		}
		 void showMeaage2()
		{
			System.out.println("this is second method for singleton");		
			}
	}

