package ch6;
import java.util.*;
public class q12 
{
	static int  n;
	static int a[];
	static int cap;
	static int i;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter no of weights");
			n=sc.nextInt();
			 a=new int[n];
			System.out.println("enter weight values");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
				System.out.println("enter weight capacity");
				cap=sc.nextInt();
		}
		sc.close();
		knapsack(0,cap);
	}
	
	private static boolean knapsack(int start,  int total)
	{
        if (n==start)
            return false;
        int curr = a[start];
        if (curr==total)
        {
           System.out.println(curr);
           return true;
        }
        else if (curr>total ||!knapsack(start+1,total-curr))
        {
            return knapsack(start+1,total);
        }
        System.out.println(curr);
        return true;
    }
}