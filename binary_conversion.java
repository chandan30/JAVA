package ch6;
import java.util.*;
public class q11 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter number in decimal");
			int n=sc.nextInt();
			q11 ob=new q11();
			int r=ob.dectobin(n);
			System.out.println("decimal to binary="+r);
		}
		sc.close();
	}
int dectobin(int n)
{
	if(n==0)
		return 0;
	else 
	return (n%2+10*dectobin(n/2));
}
}
