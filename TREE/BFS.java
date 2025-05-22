//Breadth First Search

import java.util.*;
public class BFS {

	private int V;
	private LinkedList<Integer> adj[];

	
	BFS(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	void addEdge(int v, int w) { adj[v].add(w); }

	void Search(int s)
	{
		boolean visited[] = new boolean[V];

		LinkedList<Integer> queue
			= new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {

			s = queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String args[])	{
		BFS g = new BFS(8);
        g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 5);
		g.addEdge(3, 6);
        g.addEdge(4, 7);
		g.addEdge(5, 7);
		g.addEdge(6, 7);

		System.out.println(
			"Following is Breadth First Traversal "
			+ "(starting from vertex 2)");

		g.Search(0);
	}
}

//                     OTHERWISE..................

//import java.util.*;
//public class q2 {
//    private int V;
//	private LinkedList<Integer> adj[];
//    q2(int v)
//	{
//		V = v;
//		adj = new LinkedList[v];
//		for (int i = 0; i < v; ++i)
//			adj[i] = new LinkedList();
//	}
//    void addEdge(int v, int w) { adj[v].add(w); }
//
//	void BFS(int s)
//	{
//		boolean visited[] = new boolean[V];
//
//		LinkedList<Integer> queue
//			= new LinkedList<Integer>();
//		visited[s] = true;
//		queue.add(s);
//
//		while (queue.size() != 0) {
//
//			s = queue.poll();
//			System.out.print(s + " ");
//			Iterator<Integer> i = adj[s].listIterator();
//			while (i.hasNext()) {
//				int n = i.next();
//				if (!visited[n]) {
//					visited[n] = true;
//					queue.add(n);
//				}
//			}
//		}
//	}
//    public static void main(String args[])  {
//		q2 graph = new q2(4);
//		graph.addEdge(0, 1);
//		graph.addEdge(0, 2);
//		graph.addEdge(1, 2);
//		graph.addEdge(2, 0);
//		graph.addEdge(2, 3);
//		graph.addEdge(3, 3);
//
//		System.out.println(
//			"Following is Breadth First Traversal "
//			+ "(starting from vertex 2)");
//
//		graph.BFS(2);
//	}
//}
