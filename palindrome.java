package ch6;
import java.util.*;
public class q8 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			int n;
			System.out.println("enter a number");
			n=sc.nextInt();
			q8 ob=new q8();
			int r=ob.palin(n,0);
			System.out.println("reverse="+r);
		}
		sc.close();
	}
int palin(int n,int rev)
{
	if(n==0)
		return rev;
	else if(n>0)
	{
		int r=n%10;
		rev=rev*10+r;
		return palin(n/10,rev);
	}
	else 
		return -1;
}
}
