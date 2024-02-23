import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }
    val list = MutableList(n) { i -> i + 1}
    repeat(m) {
        val (from, to) = readLine().split(" ").map{ it.toInt() - 1 }
        var cnt = 0
        for (i in 0 until (to - from) / 2 + 1) {
            list.rangeReverse(from, to, cnt)
            cnt++
        }
    }

    list.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    close()

}
fun MutableList<Int>.rangeReverse(index1: Int, index2: Int, cnt: Int) {
    val tmp = this[index1 + cnt] // 'this' corresponds to the list
    this[index1 + cnt] = this[index2 - cnt]
    this[index2 - cnt] = tmp
}