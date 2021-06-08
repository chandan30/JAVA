package ch6;
import java.util.*;
public class q9 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
		
			System.out.println("enter n");
			int n=sc.nextInt();
			q9 ob=new q9();
			int r=ob.fibo(n);
			System.out.println("result="+r);
		}
		sc.close();
	}
int fibo(int n)
{
	if(n<=1)
		return n;
	else
		return fibo(n-1)+fibo(n-2);
	
}
}
