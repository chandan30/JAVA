package ch6;
import java.util.*;
public class q4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			int n;
			System.out.println("enter the size of array");
			n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("enter the no u want to search");
			int key=sc.nextInt();
			int low=0,high=n-1,mid=0,k=0;
			while(low<=high)
			{
				mid=(low+high)/2;
				 if(a[mid]>key)
					high=mid-1;
				else if(a[mid]<key) 
					low=mid+1;
				else if(a[mid]==key)
				{
					k=1;
					break;
				}
			}
			if(k==1)
				System.out.println("found");
			else
				System.out.println("not found");
		}
		sc.close();
	}
}
