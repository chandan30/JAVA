package ch6;
import java.util.*;
public class q13 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter groupsize");
			int groupsize=sc.nextInt();
			System.out.println("enter teamsize");
			int teamsize=sc.nextInt();
			showteams(teamsize,groupsize);
			
		}
		sc.close();
	}
public static void showteams(int teamsize,int groupsize)
{
	if(teamsize>groupsize||teamsize<0||groupsize<0)
		System.out.println("not possible");
	else 
	{
		
	}
	
}
	
}
