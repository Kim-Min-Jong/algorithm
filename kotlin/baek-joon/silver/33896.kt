import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
data class COSS(val name:String, val score: Int, val risk: Int, val cost: Int, val total: Int)

fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val list = mutableListOf<COSS>()

    repeat(t) {
        val (name, score, risk, cost) = readLine().split(" ")
        val scoreInt = score.toInt()
        val riskInt = risk.toInt()
        val costInt = cost.toInt()
        val total = (scoreInt * scoreInt * scoreInt) / (costInt * (riskInt + 1))
        list.add(COSS(name, score.toInt(), risk.toInt(), cost.toInt(), total))
    }

    val res = list.sortedWith(compareByDescending<COSS> { it.total }.thenBy { it.cost }.thenBy { it.name })

    bw.write("${res[1].name}")

    closeBW()
    close()
}