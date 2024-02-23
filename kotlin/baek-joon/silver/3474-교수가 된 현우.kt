import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        var num = readLine().toInt()
        var cnt = 0
        while(num>=5){
            cnt += num / 5
            num /= 5
        }
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
    close()
}