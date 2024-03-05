package array;

public class ArraysPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {111,222,333,4569,555};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int rev=0;
			while(temp>0)
			{
				int rem=temp%10;
				rev=(rev*10)+rem;
				temp=temp/10;
				
				
				
			}
			if(a[i]==rev)
			{
				cnt++;
			}
			else
			{
				break;
			}}
			if(cnt==a.length)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println(false);
			}
		

	}

}
