import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.HashMap
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
    
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, a, b) = readLine().split(" ").map { it.toInt() }
    val timetable = readLine().split(" ").map { it.toInt() }
    val likeSubject = readLine().split(" ").map { it.toInt() }.toSet()
    val hateSubject = readLine().split(" ").map { it.toInt() }.toSet()

    var score = 0
    var currentType: String? = null
    var count = 0

    for (subject in timetable) {
        val type = when {
            subject in likeSubject -> "like"
            subject in hateSubject -> "hate"
            else -> null
        }

        if (type == currentType && type != null) {
            count++
        } else {
            if (count >= 3) {
                score += if (currentType == "like") count else -count
            }
            currentType = type
            count = if (type != null) 1 else 0
        }
    }

    // 마지막 구간 처리
    if (count >= 3) {
        score += if (currentType == "like") count else -count
    }

    bw.write("$score")

    closeBW()
    close()
}