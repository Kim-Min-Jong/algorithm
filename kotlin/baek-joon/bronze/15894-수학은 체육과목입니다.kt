import java.io.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    bw.write("${4L * n.toLong()}");
    bw.flush()
    bw.close()
    close()
} // 사걱형 둘레 공식 적용
