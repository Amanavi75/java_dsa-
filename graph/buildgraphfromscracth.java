package graph;
import java.util.*;
public class buildhrapg {
    static class Edge {
        int src ;
        int dest ;
        int wt ;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;

        }
    }
    // tc = o(v+e)
    public static void bfs(ArrayList<Edge>[]  graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0); // source =0

        while(!q.isEmpty()){
            int curr = q.remove();

            if (!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i =0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph , int curr , boolean vis[]){
        // vis 
        System.out.print(curr+" ");
      vis[curr]=true;

      for(int i =0;i<graph[curr].size();i++){
        Edge e = graph[curr].get(i);
        if(!vis[e.dest]){
            dfs(graph,e.dest,vis);
        }
      }


    }

    public static void main(String args[]){
        // create a directed weighted graph with 5 vertices and add edges to it
        int v = 5;
        ArrayList<Edge>[] graph= new ArrayList[v]; // null empty arrayList 

        for(int i =0;i<v;i++){
            graph[i]= new ArrayList<>();
        }
        //0- vertex 

        graph[0].add(new Edge(0,1,5));
        //1 vertex
        graph[1].add(new Edge(1,1,5));
        graph[1].add(new Edge(1,3,1));
        graph[1].add(new Edge(1,3,3));

        //2 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));
        // 3 vertex
        graph[3].add(new Edge(3,4,3));
        graph[3].add(new Edge(3,4,1));
        //4 vertex
        graph[4].add(new Edge(4,2,2));


        //2's neighbours 
        for(int i =0;i<graph[2].size();i++){
            Edge e = graph[2].get(i); // src, dest , wt
            System.out.println(e.dest);
        }
        bfs(graph);
        System.out.println();
        dfs(graph,0, new boolean [v]);
       
    }
}
