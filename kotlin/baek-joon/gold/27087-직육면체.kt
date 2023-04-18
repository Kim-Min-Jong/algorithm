import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
        val n = readLine().toInt()
    repeat(n) {
        val (a, b, c, p) = readLine().split(" ").map{it.toInt()}
        var res = 0

        for(i in listOf(a,b,c)) {
            if(i % p == 0) res++
        }
        val answer = if(res > 1) 1 else 0
        bw.write("$answer\n")

    }
    bw.flush()
    bw.close()
    close()
}