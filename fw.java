import java.util.*;
class all
{
	final static int inf=99999,v=5;
	void floydwarshall(int graph[][])
	{
	int dist[][]=new int[v][v];
	int i,j,k;
	
	for(i=0;i<v;i++)
	for(j=0;j<v;j++)
	dist[i][j]=graph[i][j];
	
	for(k=0;k<v;k++)
	{
	for(i=0;i<v;i++)
	{
		for(j=0;j<v;j++)
		{
		if(dist[i][k]+dist[k][j]<dist[i][j])
		dist[i][j]=dist[i][k]+dist[k][j];
		}
	}
	  }
	printsolution(dist);
	}
	void printsolution(int dist[][])
	{
	System.out.println("matrix:");
	for(int i=0;i<v;i++)
	{
	for(int j=0;j<v;j++)
	{
	if(dist[i][j]==inf)
	System.out.print("inf");
	else
	System.out.print(dist[i][j]+" ");
	}
	System.out.println();
	}	
}
public static void main(String args[])
{
	int graph[][]={{0,inf,5,inf,2},
			{4,0,7,inf,6},
			{inf,inf,0,1,4},
			{3,3,inf,0,inf},
			{inf,inf,inf,1,0}
			};
all a=new all();
a.floydwarshall(graph);
}
}


	
