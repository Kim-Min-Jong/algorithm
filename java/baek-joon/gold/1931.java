import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int tmp = -1;

        ArrayList<Pair> list = new ArrayList<>();

        while (n-- > 0) {
            String[] input = br.readLine().split(" ");
            list.add(new Pair(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            if (tmp <= list.get(i).first) {
                cnt++;
                tmp = list.get(i).second;
            }
        }

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}

class Pair implements Comparable<Pair> {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public int compareTo(Pair o) {
        if (second == o.second)
            return first - o.first;
        return second - o.second;
    }
}