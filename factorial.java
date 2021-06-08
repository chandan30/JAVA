package ch6;
import java.util.*;
public class q1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("factorial of"+n+"="+f);
		sc.close();
	}
	
}
