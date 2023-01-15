
public class FindMissingNumber {
	public static void main(String[] args) {
		int[] a= {1,2,3,5};
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1+=a[i];
			
		}
		System.out.println("this number sum of present inarray"+sum1);
		int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
			
		}
	
		System.out.println("real numbers sum"+sum2);
		System.out.println("real numbers sum"+(sum2-sum1));
	}
}

