import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val tc = n * (n - 1) / 2
    val map = hashMapOf<String, Int>()

    repeat(tc) {
        val (team1, team2, score1, score2) = readLine().split(" ")
        if (score1.toInt() > score2.toInt()) {
            map[team1] = map.getOrDefault(team1, 0) + 3
            map[team2] = map.getOrDefault(team2, 0) + 0
        } else if (score1.toInt() < score2.toInt()) {
            map[team1] = map.getOrDefault(team1, 0) + 0
            map[team2] = map.getOrDefault(team2, 0) + 3
        } else {
            map[team1] = map.getOrDefault(team1, 0) + 1
            map[team2] = map.getOrDefault(team2, 0) + 1
        }
    }

    val list = map.toList().sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first })

//    val cnt = if (n >= 5)
    list.take(5).forEach {
        bw.write("${it.first} ${it.second}\n")
    }
    closeBW()
    close()
}