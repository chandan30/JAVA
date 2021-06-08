package ch6;
import java.util.*;
public class q3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		q3 ob=new q3();
		int s=ob.triangle(n);
		System.out.println("triangular number="+s);
		sc.close();
		}
	}
int triangle(int n)
{
	if(n==1)
		return 1;
	else
		return n+triangle(n-1);
}
}
