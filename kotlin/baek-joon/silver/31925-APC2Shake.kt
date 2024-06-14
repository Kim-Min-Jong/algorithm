import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

data class APC2Shake(val name: String, val isAttending: String, val awarded: String, val topGrade: Int, val grade2024: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<APC2Shake>()

    repeat(n) {
        val (name, isAttending, awarded, topGrade, grade2024) = readLine().split(" ")
        list.add(APC2Shake(name, isAttending, awarded, topGrade.toInt(), grade2024.toInt()))
    }

    list.filter{
        it.isAttending == "jaehak" && it.awarded == "notyet" && (it.topGrade > 3 || it.topGrade == -1)
    }.sortedBy { it.topGrade }.take(10).sortedBy { it.name }.run {
        bw.write("${size}")
        forEach { bw.write("\n${it.name}") }
    }


    bw.flush()
    bw.close()
    close()
}