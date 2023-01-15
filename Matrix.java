package iamPrograms;

public class Matrix {
	public static void main(String[] args)
	{
		int[][] a= {{1,0,0},{0,1,0},{0,0,1}};
		int[][] b= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] c=new int[3][3];
		//int[][] d=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			//d[i][j]=0;
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;
				
				for(int k=0;k<3;k++)
				{
					 c[i][j]+=a[i][k]*b[k][j];
				}
					 
				 System.out.print(c[i][j]);
				}
				//System.out.print(c[i][j]);
				
			System.out.println();
		}
			
			//System.out.println();
		}
		
	}


