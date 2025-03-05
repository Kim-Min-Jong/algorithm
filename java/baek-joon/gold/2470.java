import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] list = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int left = 0;
        int right = list.length - 1;
        int tmpValue = Integer.MAX_VALUE;

        int res1 = 0;
        int res2 = 0;

        while (left < right) {
            int tmp = list[left] + list[right];
            if (tmpValue > Math.abs(tmp)) {
                tmpValue = Math.abs(tmp);
                res1 = list[left];
                res2 = list[right];
            }
            if (tmp < 0) {
                left++;
            } else {
                right--;
            }
        }

        bw.write(String.format("%d %d",res1, res2));
        bw.flush();
        bw.close();
        br.close();
    }
}
