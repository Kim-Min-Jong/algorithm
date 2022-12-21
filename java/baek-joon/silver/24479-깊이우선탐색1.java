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
        int[] visited = new int[V+1];
        boolean[] boolVisited = new boolean[V+1];
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
        boolVisited[root] = true;
        visited[root] = 1;

        for(int i = 1; i <= V; i++) {
            Collections.sort(list[i]);
        }

        dfs(list, visited, root);

        for(int i = 1; i <= V; i++) {
            bw.write(visited[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(ArrayList<Integer>[] list, int[] visited, int root) {
        visited[root] = ++cnt;
        for(Integer ll: list[root]) {
            if(visited[ll] == 0) {
                dfs(list, visited, ll);
            }
        }
    }
}

