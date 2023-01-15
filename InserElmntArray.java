package RemoveDuplicates;

import java.util.Scanner;

public class InserElmntArray {
	
	public static void main(String[] args)
	
	{
		
 int[] arr=new int[5];

 System.out.println("enter elements:");

 Scanner sc =new Scanner(System.in);

for(int i=0;i>arr.length;i++)
	
{
	arr[i]=sc.nextInt();
}

for(int aa:arr)
{
	System.out.println(aa);
	
}
System.out.println("location");

int location=sc.nextInt();

System.out.println("enter value");

int value=sc.nextInt();

for(int i=arr.length-1;i>location;i--)
{
	arr[i]=arr[i-1];
}

arr[location]=value;

for(int aa:arr)
	
{
	System.out.println(aa);
}

	}
}
