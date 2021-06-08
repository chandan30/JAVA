package ch6;
import java.util.*;
public class q7 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			int x,n;
			System.out.println("enter the value of x & n");
			x=sc.nextInt();
			n=sc.nextInt();
			q7 ob=new q7();
			int r=ob.power(x,n);
			System.out.println("power="+r);
		}
		sc.close();
	}
int power(int x,int n)
{
	if(n==0)
		return 1;
	else
		return x*power(x,n-1);
}
}
