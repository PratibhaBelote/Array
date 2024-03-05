package array;

import java.util.Arrays;

public class interLiving {

	public static void main(String[] args) {
		
		int[] s1= {22,33,66,88,55};
		int[] s2= {66,44,48,95,26};
		int[] s3=new int[s1.length+s2.length];
		
		int index=0;
		for(int i=0;i<s1.length || i<s2.length;i++)
		{
			if(i<s1.length)
			{
				s3[index]=s1[i];
				index++;
			}
			if(i<s2.length)
			{
				s3[index]=s2[i];
				index++;
			}
		
		}
		//for(int i=0;i<s3.length;i++)
		//{
			//System.out.print(s3[i]+"");
		//}
		System.out.println(Arrays.toString(s3));   //shortcut array print karaycha

		}
}