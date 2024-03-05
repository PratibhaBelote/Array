package array;

public class evenodd {

	public static void main(String[] args) {
		
		int[] a= {20,45,63,98,65,56};
		int evencnt=0;
		int oddcnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evencnt++;
			}
			else
			{
				oddcnt++;
			}
		}                             //odd even kiti no.aahet te cnt karnya sathi
		
		int[] evenArr=new int[evencnt];   
		int[] oddArr=new int[oddcnt];        //pahije tevdya length cha array print karnya sathi
		
		int evenIndex=0;
		int oddIndex=0;                      //stack madhe index no. assign karnya sathi
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenArr[evenIndex]=a[i];
				evenIndex++;
			}
			else
			{
				oddArr[oddIndex]=a[i];
				oddIndex++;                        //even odd number stack madhe sequantially assign karnya sathi
			}
		}
		
		for(int i=0;i<evenArr.length;i++)
		{
			System.out.print(evenArr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<oddArr.length;i++)
		{
			System.out.print(oddArr[i]+" ");        
		}
	}

}
