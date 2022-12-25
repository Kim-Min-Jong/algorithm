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
        long [] depthList = new long[V + 1];
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
            Collections.sort(list[i]);
        }
        for(int i = 1; i <= V; i++){
            depthList[i] = -1;
        }
        bfs(list, root, depthList);

        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(ArrayList<Integer>[] graph, int root, long[] depthList) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V + 1];
        long[] nodeVisited = new long[V + 1];
        int dep = 0;
        long sum = 0;
        visited[root] = true;
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                int q = queue.poll();
                depthList[q] = dep;
                nodeVisited[q] = cnt++;
                for (int i : graph[q]) {
                    if (!visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
                size--;
            }
            dep++;
        }

        for(int i = 1; i <= V; i++) {
            sum += nodeVisited[i] *  depthList[i];
        }
        System.out.println(sum);
    }
}