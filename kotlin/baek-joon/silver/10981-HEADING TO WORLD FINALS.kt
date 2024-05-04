import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

data class ICPC(val univ: String, val team: String, val solvedProblems: Int, val penalty: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map{ it.toInt() }
    val list = mutableListOf<ICPC>()
    val duplicatedUniv = mutableSetOf<String>()
    var cnt = 0

    repeat(n) {
        val (univ, team, solvedProblems, penalty) = readLine().split(" ")
        list.add(ICPC(univ, team, solvedProblems.toInt(), penalty.toInt()))
    }

    val sortedList = list.sortedWith(compareByDescending<ICPC> { it.solvedProblems }.thenBy { it.penalty })

    for (i in 0 until n) {
        if (cnt == k) break
        else {
            if (sortedList[i].univ !in duplicatedUniv) {
                bw.write("${sortedList[i].team}\n")
                duplicatedUniv.add(sortedList[i].univ)
                cnt++
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}
