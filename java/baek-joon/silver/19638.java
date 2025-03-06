import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int cnt = 0;

        for (int i = 0; i < list[0]; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < list[2]; i++) {
            if (pq.peek() < list[1] || pq.peek() == 1) break;
            else {
                int tmp = pq.poll() / 2;
                pq.add(tmp);
                cnt++;
            }
        }

        if (pq.peek() >= list[1]) {
            bw.write("NO\n" + String.format("%d", pq.peek()));
        } else {
            bw.write("YES\n" + String.format("%d", cnt));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}