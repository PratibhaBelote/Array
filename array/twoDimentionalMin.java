package array;

public class twoDimentionalMin {

	public static void main(String[] args) {
		
				
				int[][]a= {{22,55,66},
						{55,66,88},
						{20,60,30}};
				
				int min=Integer.MAX_VALUE;
				
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
						if(a[i][j]<min)
						{
							min=a[i][j];
						}
					}
				}
					System.out.println(min);
				

			}
	}

