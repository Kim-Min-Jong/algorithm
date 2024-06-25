import java.io.BufferedWriter
import java.io.OutputStreamWriter


val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val m = readLine().toInt()
    val n = readLine().toInt()
    
    // 가로 n 줄, 세로 m 줄 마지막 줄 -1 * 가로세로 2개
    bw.write("${2 * (n - 1) * (m - 1)}")

    bw.flush()
    bw.close()
    close()
}