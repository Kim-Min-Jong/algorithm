import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int rearValue = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] m = br.readLine().split(" ");
            switch (m[0]) {
                case "push":
                    queue.add(Integer.parseInt(m[1]));
                    rearValue = Integer.parseInt(m[1]);
                    break;
                case "pop":
                    if (queue.isEmpty()) bw.write("-1\n");
                    else bw.write(String.valueOf(queue.poll()) + "\n");
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()) +"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(String.valueOf(queue.peek())+"\n");
                    break;
                case "back":
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(String.valueOf(rearValue)+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}