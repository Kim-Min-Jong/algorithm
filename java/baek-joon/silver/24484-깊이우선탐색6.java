import java.io.*;
import java.util.*;

public class Main {
    static int V;
    static int E;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        int root = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] list = new ArrayList[V+1];
        long[] visited = new long[V+1];
        long[] depthVisited = new long[V+1];
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
            depthVisited[i] = -1;
        }
        visited[root] = 1;

        for(int i = 1; i <= V; i++) {
            list[i].sort(Collections.reverseOrder());
        }

        dfs(list, visited, depthVisited, root, 0);

        long sum = 0;
        for(int i = 1; i <= V; i++) {
            sum += depthVisited[i] * visited[i];
        }

        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(ArrayList<Integer>[] list, long[] visited, long[] depthVisited, int root, int depth) {
        depthVisited[root] = depth;
        visited[root] = ++cnt;
        for(Integer ll: list[root]) {
            if(depthVisited[ll] == -1 && visited[ll] == 0) {
                dfs(list, visited, depthVisited, ll, depth+1);
            }
        }
    }
}