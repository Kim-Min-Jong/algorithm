import java.io.*;
import java.util.*;

public class Main {
    static int V;
    static int E;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        int root = Integer.parseInt(st.nextToken());
        int [] depthList = new int[V+1];
        ArrayList<Integer>[] list = new ArrayList[V + 1];


        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i <= E; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 1; i <= V; i++) {
            list[i].sort(Collections.reverseOrder());
        }
        for(int i=1;i<=V;i++){
            depthList[i]=-1;
        }
        bfs(list, root, depthList);

        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(ArrayList<Integer>[] graph, int root,int[] depthList) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V + 1];
        int dep = 0;
        visited[root] = true;
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                int q = queue.poll();
                // 순회 깊이 저장
                depthList[q] = dep;
                for (int i : graph[q]) {
                    if (!visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
                // 한 번 지점 찍었으니 그 지점은 판별안하도록 큐 사이즈 감소
                size--;
            }
            dep++;
        }

        for (int i = 1; i <= V; i++) {
            System.out.println(depthList[i]);
        }
    }
}