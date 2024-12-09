import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
data class MutablePair<T1, T2>(var first: T1, var second: T2)
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<MutablePair<Int, Int>>()
    var spot = MutablePair(0, 0)

    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        list.add(MutablePair(x, y))
    }

    val commands = readLine()
    for (i in commands.indices) {
        when(commands[i]) {
            'U' -> {
                spot.second++
                if (spot in list) spot.second--
            }
            'D' -> {
                spot.second--
                if (spot in list) spot.second++
            }
            'R' -> {
                spot.first++
                if (spot in list) spot.first--
            }
            'L' -> {
                spot.first--
                if (spot in list) spot.first++
            }
        }
    }

    bw.write("${spot.first} ${spot.second}")

    closeBW()
    close()
}