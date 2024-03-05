package array;

public class binarySearch {

	public static void main(String[] args) {
		
		int[] a= {11,22,33,44,55,66};
		int ele=11;
		int start=0;
		int end=a.length-1;
		int cnt=0;
		while(start<=end)
		{
			int mid=(start+end)/2;
			for(int i=0;i<a.length;i++)
			{
			if(a[mid]==ele)
			{
				cnt++;
				System.out.println("found at index"+" "+a[i]);
				break;
			}
			}
			if(ele<a[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		if(cnt==0)
		{
		 System.out.println("not found");
		}

	}

}
