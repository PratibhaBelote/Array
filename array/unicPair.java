package array;

public class unicPair {

	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,2,3};
		
         int uniqeElment=0;
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
			{
				uniqeElment++;
		        System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Unic array digit number"+" "+uniqeElment);      //unic array digit find
		
		int[] b=new int[uniqeElment];
		
		int index=0;
			
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
			{
				b[index]=a[i];
				index++;
			}
		}                                                     //create unic array tyachi lenght mahit nastana
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i]+" "+b[j]);           //print unic pair
			}
		}
	}
}


