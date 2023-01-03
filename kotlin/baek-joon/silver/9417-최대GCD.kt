import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val list = readLine().split(" ").map{it.toInt()}
        val answer = mutableListOf<List<Int>>()
        val res = mutableListOf<Int>()
        combination(answer, list, Array<Boolean>(list.size){false},0, 2)
        answer.forEach {
            val gcd = gcd(it[0], it[1])
            res.add(gcd)
        }
        bw.write("${res.maxOrNull()}\n")
    }

    bw.flush()
    bw.close()
    close()
}
fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
    if (target == 0) {
        answer.addAll(listOf(el.filterIndexed { index, t -> ck[index] }))
    } else {
        for (i in start until el.size) {
            ck[i] = true
            combination(answer, el, ck, i + 1, target - 1)
            ck[i] = false
        }
    }
}
fun gcd(n: Int, m: Int): Int {
    return if (n < m) {
        if (n == 0) m else gcd(n, m % n)
    } else {
        if (m == 0) n else gcd(m, n % m)
    }
}