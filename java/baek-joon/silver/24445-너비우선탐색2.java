import java.io.*;
import java.util.*;

public class Main {
    static int V;
    static int E;
    static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        int root = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] list = new ArrayList[V+1];
        int[] visited = new int[V+1];
        for(int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 1; i <= E; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        for(int i = 1; i <= V; i++) {
            list[i].sort(Collections.reverseOrder());
        }

        bfs(list, visited, root);

        for(int i = 1; i <= V; i++) {
            bw.write(visited[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(ArrayList<Integer>[] graph, int[] visited, int root) {
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[root] = cnt++;
        queue.add(root);
        while(!queue.isEmpty()) {
            Integer tmp = queue.poll();
            for(Integer x: graph[tmp]) {
                if(visited[x] > 0) continue;
                queue.add(x);
                visited[x] = cnt++;
            }
        }
    }
}