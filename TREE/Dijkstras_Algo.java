//import java.lang.*;
import java.util.*;

public class Dijkstras_Algo {
	static final int V = 9;
	int minDistance(int dist[], Boolean sptSet[])
	{
		int min = Integer.MAX_VALUE, min_index = -1;

		for (int v = 0; v < V; v++)
			if (sptSet[v] == false && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}

		return min_index;
	}

	void printSolution(int dist[])
	{
		System.out.println(
			"Vertex \t Distance from Source");
		for (int i = 0; i < V; i++)
			System.out.println(i + " \t " + dist[i]);
	}

	void dijkstra(int graph[][], int src)
	{
		int dist[] = new int[V]; 
		Boolean sptSet[] = new Boolean[V];
		for (int i = 0; i < V; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}

		dist[src] = 0;

		for (int count = 0; count < V - 1; count++) {
			int u = minDistance(dist, sptSet);

			sptSet[u] = true;
			for (int v = 0; v < V; v++)
				if (!sptSet[v] && graph[u][v] != 0
					&& dist[u] != Integer.MAX_VALUE
					&& dist[u] + graph[u][v] < dist[v])
					dist[v] = dist[u] + graph[u][v];
		}
		printSolution(dist);
	}
	public static void main(String[] args)
	{
		int graph[][]
			= new int[][] { { 0, 5, 0, 0, 0, 0, 0, 4, 0 },
							{ 5, 0, 4, 0, 0, 0, 0, 2, 0 },
							{ 0, 4, 0, 7, 0, 5, 0, 0, 9 },
							{ 0, 0, 7, 0, 11, 12, 0, 0, 0 },
							{ 0, 0, 0, 11, 0, 14, 0, 0, 0 },
							{ 0, 0, 5, 12, 14, 0, 9, 0, 0 },
							{ 0, 0, 0, 0, 0, 9, 0, 1, 21 },
							{ 4, 2, 0, 0, 0, 0, 1, 0, 7 },
							{ 0, 0, 9, 0, 0, 0, 21, 7, 0 } };
		Dijkstras_Algo t = new Dijkstras_Algo();
		t.dijkstra(graph, 0);
	}
}
