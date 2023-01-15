package RemoveDuplicates;

public class RmCharElements {
	public static void main(String[] args)
	{
		String str="Rammohan";
		char[] ar=str.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
						ar[i]=0;
					}
				}
			}
		}
		for(int k=0;k<ar.length;k++)
		{
			if(ar[k]!=0)
			{
				System.out.print(ar[k]);
			}
			
		}
	}

}
