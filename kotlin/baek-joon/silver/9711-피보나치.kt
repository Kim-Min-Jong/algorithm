import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val (p, q) = readLine().split(" ").map{it.toInt()}
        val answer = fiboIter(p, q)
        bw.write("Case #${it+1}: ${answer}\n")
    }
    bw.flush()
    bw.close()
    close()
}
fun fiboIter(p: Int, q:Int): Long {
    var tmp = 1L
    var pivot = 0L
    var next = 0L
    if(p == 1 || p == 2) return (1L % q)
    else {
        for (i in 1 until p) {
            next = (tmp + pivot) % q
            pivot = tmp % q
            tmp = next % q
        }
        return next
    }
}