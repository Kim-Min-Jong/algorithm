import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int[] command = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (command.length == 2) {
                stack.push(command[1]);
            } else {
                switch (command[0]) {
                    case 2:
                        if (!stack.isEmpty()) {
                            bw.write(String.format("%d\n", stack.pop()));
                        } else {
                            bw.write("-1\n");
                        }
                        break;
                    case 3:
                        bw.write(String.format("%d\n", stack.size()));
                        break;
                    case 4:
                        if (stack.isEmpty()) {
                            bw.write("1\n");
                        } else {
                            bw.write("0\n");
                        }
                        break;
                    case 5:
                        if (!stack.isEmpty()) {
                            bw.write(String.format("%d\n", stack.peek()));
                        } else {
                            bw.write("-1\n");
                        }
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
