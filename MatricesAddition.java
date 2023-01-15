package iamPrograms;

public class MatricesAddition {
	public static void main(String[] args)
	{
		int[][] a= {{1,0,0},{0,1,0},{0,0,1}};
		int[][] b= {{1,0,0},{0,1,0},{0,0,1}};
		int[][] c=new int[3][3];
		for(int i=0;i<3;i++)
		{
			//c[i][j]=0;
			
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();
			//System.out.println(c[i][j]);
		}
	}

}
