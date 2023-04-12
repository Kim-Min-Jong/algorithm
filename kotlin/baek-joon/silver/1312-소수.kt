import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var (A, B, N) = readLine().split(" ").map{it.toInt()}
    var res = -1
    for(i in 0 until N) {
        A = (A % B) * 10
        res = A.div(B)
    }
    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}