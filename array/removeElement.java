package array;

import java.util.Arrays;

public class removeElement {

	public static void main(String[] args) {
		
		int[] a= {11,22,33,11,55,66,11,11,11};
		int ele=11;
		
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				cnt++;
			}
		}
		int[] b=new int[cnt];
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				b[index]=a[i];
				index++;
			}
		}
		System.out.print(Arrays.toString(b));

	}

}
