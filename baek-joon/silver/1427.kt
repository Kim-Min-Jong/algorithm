import java.io.*


fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().chunked(1)
        bw.write(n.sortedByDescending { it }.joinToString("")+"\n")
        bw.flush()
        bw.close()
        this.close()
}
