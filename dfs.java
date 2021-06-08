class stackx
{
	private final int size=20;
	private int[] st;
	private int top;
public stackx()
{
	st=new int[size];
	top=-1;
}
public void push(int j)
{
st[++top]=j;
}
public int pop()
{
return st[top--];
}
public int peek()
{
return st[top];
}
public boolean isempty()
{
return(top==-1);
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
	private stackx thestack;
public graph()
{
	vertexlist=new vertex[max_verts];
	adjmat=new int[max_verts][max_verts];
	nverts=0;
	for(int j=0;j<max_verts;j++)
	for(int k=0;k<max_verts;k++)
	adjmat[j][k]=0;
	thestack=new stackx();
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
public void dfs(int x)
{
vertexlist[x].wasvisited=true;
displayvertex(x);
thestack.push(x);
while(!thestack.isempty())
{
int v=getadjunvisitedvertex(thestack.peek());
if(v==-1)
thestack.pop();
else
{
vertexlist[v].wasvisited=true;
displayvertex(v);
thestack.push(v);
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

class dfsapp
{
public static void main(String args[])
{
graph thegraph=new graph();
thegraph.addvertex('a');
thegraph.addvertex('b');
thegraph.addvertex('c');
thegraph.addvertex('d');
thegraph.addvertex('e');
/*thegraph.addvertex('f');
thegraph.addvertex('g');
thegraph.addvertex('h');
thegraph.addvertex('i');*/
thegraph.addedge(0,1);
thegraph.addedge(1,2);
/*thegraph.addedge(5,7);
thegraph.addedge(0,2);*/
thegraph.addedge(0,3);
thegraph.addedge(3,4);
/*thegraph.addedge(6,8);
thegraph.addedge(0,4);*/
System.out.print("visits:");
for(int i=0;i<5;i++)
{
thegraph.dfs(i);
System.out.println();
}
}
}



