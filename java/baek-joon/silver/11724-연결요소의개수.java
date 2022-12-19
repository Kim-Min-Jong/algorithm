import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int v;
    static int e;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        int[][] graph = new int[v+1][v+1];
        boolean[] visited = new boolean[v+1];

        for(int i = 0; i < e; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        int res = 0;
        for(int i = 1; i <= v; i++) {
            if(!visited[i]) {
                dfs(graph, visited,i);
                res++;
            }
        }
        bw.write(String.valueOf(res));

        bw.flush();
        bw.close();
        br.close();
    }
    static void dfs(int[][] graph, boolean[] visited, int idx) {
        if(visited[idx])
            return;
        else {
            visited[idx] = true;
            for(int i = 1; i <= v; i++) {
                if(graph[idx][i] == 1)
                    dfs(graph, visited, i);
            }
        }
    }
}