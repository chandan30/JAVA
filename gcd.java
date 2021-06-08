package ch6;
import java.util.*;
public class q10 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			q10 ob=new q10();
			int r=ob.gcd(a, b);
			System.out.println("gcd="+r);
		}
		sc.close();
	}
int gcd(int a,int b)
{
	if(a==0)
		return b;
	else if(b==0)
		return a;
	else if(a==b)
		return b;
	else if(a>b)
		return gcd(a-b,a);
	return gcd(a,b-a);
}
}
