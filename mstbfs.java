class Queue
{
private final int SIZE = 20;
private int[] queArray;
private int front;
private int rear;
public Queue() 
{
queArray = new int[SIZE];
front = 0;
rear = -1;
}
public void insert(int j) 
{
if(rear == SIZE-1)
rear = -1;
queArray[++rear] = j;
}
public int remove() 
{
int temp = queArray[front++];
if(front == SIZE)
front = 0;
return temp;
}
public boolean isEmpty() 
{
return ( rear+1==front || (front+SIZE-1==rear) );
}
}

class Vertex
{
public char label; 
public boolean wasVisited;
public Vertex(char lab) 
{
label = lab;
wasVisited = false;
}
}

class Graph
{
private final int MAX_VERTS = 20;
private Vertex vertexList[]; 
private int adjMat[][]; 
public int nVerts; 
private Queue theQueue;
public Graph() 
{
vertexList = new Vertex[MAX_VERTS];
adjMat = new int[MAX_VERTS][MAX_VERTS];
nVerts = 0;
for(int j=0; j<MAX_VERTS; j++) 
for(int k=0; k<MAX_VERTS; k++) 
adjMat[j][k] = 0;
theQueue = new Queue();
} 
public void addVertex(char lab)
{
vertexList[nVerts++] = new Vertex(lab);
}
public void addEdge(int start, int end)
{
adjMat[start][end] = 1;
adjMat[end][start] = 1;
}
public void displayVertex(int v)
{
System.out.print(vertexList[v].label);
}
public void mst(int x) 
{ 
vertexList[x].wasVisited = true; 
theQueue.insert(x); 
int v2;
while( !theQueue.isEmpty() ) 
{
int v1 = theQueue.remove(); 
while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
{ 
vertexList[v2].wasVisited = true; 
displayVertex(1);
displayVertex(v2); 
theQueue.insert(v2); 
System.out.print(" ");
} 
} 
for(int j=0; j<nVerts; j++) 
vertexList[j].wasVisited = false;
} 
public int getAdjUnvisitedVertex(int v)
{
for(int j=0; j<nVerts; j++)
if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
return j;
return -1;
} 
} 
class MSTApp
{
public static void main(String[] args)
{
Graph theGraph = new Graph();
theGraph.addVertex('A'); 
theGraph.addVertex('B'); 
theGraph.addVertex('C'); 
theGraph.addVertex('D'); 
theGraph.addVertex('E'); 
theGraph.addEdge(0, 1); 
theGraph.addEdge(0, 2); 
theGraph.addEdge(0, 3); 
theGraph.addEdge(0, 4); 
theGraph.addEdge(1, 2); 
theGraph.addEdge(1, 3); 
theGraph.addEdge(1, 4);
theGraph.addEdge(2, 3); 
theGraph.addEdge(2, 4); 
theGraph.addEdge(3, 4); 
System.out.print("Minimum spanning tree: ");
for(int i=0;i<theGraph.nVerts;i++)
{
theGraph.mst(i); 
System.out.println();
} 
} 
}