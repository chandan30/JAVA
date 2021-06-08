package ch6;
import java.util.*;
public class q6 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			int a,b;
			System.out.println("enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			q6 ob=new q6();
			int result=ob.product(a, b);
			System.out.println("product="+result);
		}
		sc.close();
	}
int product(int a,int b)
{
	
	if(b>0)
		return (a+product(a,b-1));
	else
		return 0;
}
}
