import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split("\\.");
            list.add(str[1]);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String str: list) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Map.Entry.comparingByKey());

        for (Map.Entry<String, Integer> entry: sortedList) {
            bw.write(entry.getKey() + " " + entry.getValue() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}