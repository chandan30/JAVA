package ch6;
import java.util.*;
public class q5 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter the size of an array");
			int n=sc.nextInt();
			int low=0,high=n-1;
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("enter element u want to search");
			int key=sc.nextInt();
			q5 ob=new q5();
			boolean result=ob.bsearch(a, key, low, high);
			System.out.println(result);
			
		}
		sc.close();
	}

boolean bsearch(int a[],int key,int low,int high)
{
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(a[mid]==key)
			return true;
		else if(a[mid]>key)
			return bsearch(a,key,low,mid-1);
		else 
			return bsearch(a,key,mid+1,high);	
	}
	return false;
}
}