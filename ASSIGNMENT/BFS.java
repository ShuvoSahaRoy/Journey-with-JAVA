import java.util.*;

public class BFS {
		public static void main(String args[]){
			Queue<Integer> queue = new LinkedList<Integer>();
			Stack<Integer> stk = new Stack<Integer>();
			Scanner sc=new Scanner(System.in);
			int no_of_edge,no_of_node,source,destination,edge1,edge2;
			
			System.out.println("Enter the number of nodes and edges[Node First]");
			no_of_node=sc.nextInt();
			no_of_edge=sc.nextInt();
			
			
			int visited[]=new int[no_of_node+1];
			int level[]=new int[no_of_node+1];
			int array[][]=new int [no_of_node+1][no_of_node+1];
			int parent[]=new int [no_of_node+1];
			System.out.println("Enter the edges");
			
						
			for(int i=0;i<no_of_edge;i++){
				edge1=sc.nextInt();
				edge2=sc.nextInt();
				array[edge1][edge2]=edge2;
				array[edge2][edge1]=edge1;
			}
			
			
			System.out.println("Enter the source and destination");
			source=sc.nextInt();  destination=sc.nextInt();
			
			visited[source]=1;  level[source]=0;
			queue.add(source);
			while(!queue.isEmpty()){
				edge1=queue.remove();
				for(int i=1;i<=no_of_node;i++){
					if(array[edge1][i]==0){ continue; }
					edge2=array[edge1][i];
					if(visited[edge2]==1){
						continue;
					}
					else{
						visited[edge2]=1;
						level[edge2]=level[edge1]+1;
						parent[edge2]=edge1;
						queue.add(edge2);
					}
				}
			}
			 System.out.println("Shortest path to reach from Source to Destination is : "+level[destination]);
			 System.out.println("And the path is :");
			 
			 stk.push(destination);
			    int a=destination;
			    while(true){
			        int k=parent[a];
			        stk.push(k);
			        a=k;
			        if(k==source){
			            break;
			        }
			    }
			    
			    while(!stk.empty()){
			        System.out.print(stk.peek()+" ");
			        stk.pop();
			    }
			    sc.close();
		}
}
