package ch6;
import java.util.*;
public class tower_of_fhanoi
{
	static int noofdisk=3;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			tower(noofdisk,'a','b','c');
		}
		sc.close();
	}
	public static void tower(int noofdisk,char from,char inter,char to)
	{
		if(noofdisk==1)
			System.out.println("disk 1 from "+from+" to "+to);
		else 
		{
			tower(noofdisk-1,from,to,inter);
			System.out.println("disk "+noofdisk+" from "+from+" to "+to);
			tower(noofdisk-1,inter,from,to);
			System.out.println("disk "+noofdisk+" from "+from+" to "+to);
		}
	}
}
