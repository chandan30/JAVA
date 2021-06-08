package ch6;
import java.util.*;
public class q2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter a number");
			int n=sc.nextInt();
			q2 ob=new q2();
			int factorial=ob.fact(n);
			System.out.println("factorial="+factorial);
		}
		sc.close();
	}

 int  fact(int n)
{
	 if(n==0)
	return 1;
	 else
		 return n*fact(n-1);
}
 }
