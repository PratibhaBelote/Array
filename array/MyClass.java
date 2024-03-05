package array;

public class MyClass {

	public static void main(String[] args) {
		
		/*int a=10;
		int b=20;
		int c=50;
		int d=70;
		int e=90;
		int f=50;
		int g=40;
		int h=60;
		int i=10;
		
		int[] arr= {a,b,c,d,e,f,g,h,i};
		
		int var=arr[5];
		System.out.println(var);*/
		
			
		
		//1st way
		//int[] arr= {10,20,30,40,50,60,70};
		
		/*int var=arr[6];
		System.out.println(var);
		
		arr[6]=1500;
		System.out.println(arr[6]);
		
		
		//2nd way
		int[] a=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		System.out.println(a[3]);*/
		
		
		//int sum=0;
		//int avg=0;
		int[] arr= {10,20,30,40,50,60,70};
		//int ele=90;
		//boolean flag=false;
		
		//for(int i=0;i<arr.length;i++)
		//{
			//if(arr[i]==ele)
				//flag=true;
			//sum=sum+arr[i];
			//avg=sum/arr.length;
		
		//}
			//System.out.println(sum);
			//System.out.println(avg);
		//if(flag==true)
			//System.out.println("yes");
		//else
			//System.out.println("No");
		int[] b=new int[arr.length];
		//System.out.println(b.length);
		for(int i=0;i<arr.length;i++)
		{
		  b[i]=arr[i];
		}
		for(int i=0;i<b.length;i++)
		{
		  System.out.println(b[i]);
		
		}
	}

}
