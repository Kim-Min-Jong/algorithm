import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
data class Medal(val number: Int, val gold: Int, val silver: Int, val bronze: Int, var rank: Int = 1)

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<Medal>()
    repeat(n) {
        val (number, gold, silver, bronze) = readLine().split(" ").map { it.toInt() }
        list.add(Medal(number, gold, silver, bronze))
    }

    list.sortWith(
        compareByDescending<Medal> { it.gold }
            .thenByDescending { it.silver }
            .thenByDescending { it.bronze }
    )

    for (i in 1 until list.size) {
        val now = list[i - 1]
        val tmp = list[i]

        if (tmp.gold == now.gold && tmp.silver == now.silver && tmp.bronze == now.bronze) {
            tmp.rank = now.rank
        } else {
            ++tmp.rank
        }
    }

    bw.write("${list.find { it.number == k }!!.rank}")

    bw.flush()
    bw.close()
    close()
} // 보완 필요