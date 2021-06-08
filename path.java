class distpar
{
	public int distance;
	public int parentvert;
public distpar(int pv,int d)
{
	distance=d;
	parentvert=pv;
}
}
class vertex
{
	public char label;
	public boolean isintree;
	public vertex(char lab)
	{
	label=lab;
	isintree=false;
	}
}
class graph
{
	private final int max_verts=20;
	private final int infinity=1000000;
	private vertex vertexlist[];
	private int adjmat[][];
	private int nverts;
	private int ntree;
	private distpar spath[];
	private int currentvert;
	private int starttocurrent;
	
	public graph()
	{
	vertexlist=new vertex[max_verts];
	adjmat=new int[max_verts][max_verts];
	nverts=0;
	ntree=0;
	for(int j=0;j<max_verts;j++)
	for(int k=0;k<max_verts;k++)
	adjmat[j][k]=infinity;
	spath=new distpar[max_verts];
	}
	  public void addvertex(char lab)
	    {
		vertexlist[nverts++]=new vertex(lab);
	     }
	public void addedge(int start,int end,int weight)
	{
		adjmat[start][end]=weight;
		adjmat[end][start]=weight;
	}
	public void path()
	{
	int starttree=0;
	vertexlist[starttree].isintree=true;
	ntree=1;
	for(int j=0;j<nverts;j++)
	{
		int tempdist=adjmat[starttree][j];
		spath[j]=new distpar(starttree,tempdist);
	}
	while(ntree<nverts)
	{
	int indexmin=getmin();
	int mindist=spath[indexmin].distance;

	if(mindist==infinity)
	{
	System.out.println("there are unreachable vertices");
	break;
	}
	else
	{
		currentvert=indexmin;
		starttocurrent=spath[indexmin].distance;
	}
	vertexlist[currentvert].isintree=true;
	ntree++;
	adjust_spath();
	}
	displaypaths();
	ntree=0;
	for(int j=0;j<nverts;j++)
	vertexlist[j].isintree=false;
	}

		public int getmin()
		{
			int mindist=infinity;
			int indexmin=0;
			for(int j=1;j<nverts;j++)
			{
				if(!vertexlist[j].isintree && spath[j].distance<mindist)
				{	
					mindist=spath[j].distance;
					indexmin=j;
				}	
			}
			return indexmin;
		}

	public void adjust_spath()
	{
		int column=1;
		while(column<nverts)
		{
			if(vertexlist[column].isintree)
			{
				column++;
				continue;	
			}
		int currenttofringe=adjmat[currentvert][column];
		int starttofringe=starttocurrent+currenttofringe;
		int spathdist=spath[column].distance;
		if(starttofringe<spathdist)
		{
		spath[column].parentvert=currentvert;
		spath[column].distance=starttofringe;
		}
		column++;
		}
	}

	public void displaypaths()
	{
	for(int j=0;j<nverts;j++)
	{
		System.out.print(vertexlist[j].label+"=");
		if(spath[j].distance==infinity)
		System.out.print("inf");
		else
			System.out.print(spath[j].distance);
			char parent=vertexlist[spath[j].parentvert].label;
			System.out.print("("+parent+")");
	}
	System.out.println(" ");
	}
	}

	class pathapp
	{
	public static void main(String args[])
	{
	graph thegraph=new graph();
	thegraph.addvertex('a');
	thegraph.addvertex('b');
	thegraph.addvertex('c');
	thegraph.addvertex('d');
	thegraph.addvertex('e');
	thegraph.addedge(0,1,50);
	thegraph.addedge(1,2,60);
	thegraph.addedge(0,3,80);	
	thegraph.addedge(1,3,90);
	thegraph.addedge(2,4,40);
	thegraph.addedge(3,2,20);
	thegraph.addedge(3,4,70);
	thegraph.addedge(4,1,50);
	System.out.println("shortest paths");
	thegraph.path();
	System.out.println();
	}
	}
	 
	

	
	
