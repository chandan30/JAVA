class queue
{
	private final int size=20;
	private int[] quearray;
	private int front;
	private int rear;
	public queue()
	{
	quearray=new int[size];
	front=0;
	rear=-1;
	}
	public void insert(int j)
	{
	if(rear==size-1)
	rear=-1;
	quearray[++rear]=j;
	}
	public int remove()
	{
	int temp=quearray[front++];
	if(front==size)
	front=0;
	return temp;
	}
	public boolean isempty()
	{
	return(rear+1==front);
	}
	}
class vertex
{
public char label;
public boolean wasvisited;
	public vertex(char lab)
	{
	label=lab;
	wasvisited=false;
	}
}
class graph
{
	private final int max_verts=20;
	private vertex vertexlist[];
	private int adjmat[][];
	private int nverts;
	private queue thequeue;
	public graph()
	{
	vertexlist=new vertex[max_verts];
	adjmat=new int[max_verts][max_verts];
	nverts=0;
	for(int j=0;j<max_verts;j++)
	for(int k=0;k<max_verts;k++)
	adjmat[j][k]=0;
	thequeue=new queue();
	}
	public void addvertex(char lab)
	{
	vertexlist[nverts++]=new vertex(lab);
	}
	public void addedge(int start,int end)
	{
	adjmat[start][end]=1;
	adjmat[end][start]=1;
	}	
	public void displayvertex(int v)
	{
	System.out.print(vertexlist[v].label);
	}
	public void bfs()
	{
	vertexlist[0].wasvisited=true;
	displayvertex(0);
	thequeue.insert(0);
	int v2;
	while(!thequeue.isempty())
	{
	int v1=thequeue.remove();
	while((v2=getadjunvisitedvertex(v1))!=-1)
	{
	vertexlist[v2].wasvisited=true;
	displayvertex(v2);
	thequeue.insert(v2);
	}
	}
	for(int j=0;j<nverts;j++)
	vertexlist[j].wasvisited=false;
	}
	public int getadjunvisitedvertex(int v)
	{
	for(int j=0;j<nverts;j++)
	if(adjmat[v][j]==1 && vertexlist[j].wasvisited==false)
	return j;
	return -1;
	}
}
class bfsapp
{
public static void main(String args[])
{
graph thegraph=new graph();
thegraph.addvertex('a');
thegraph.addvertex('b');
thegraph.addvertex('c');
thegraph.addvertex('d');
thegraph.addvertex('e');
thegraph.addedge(0,1);
thegraph.addedge(1,2);
thegraph.addedge(0,3);
thegraph.addedge(3,4);
System.out.print("visits:");
thegraph.bfs();
System.out.println();
}
}


