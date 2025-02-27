import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}
fun main() = with(System.`in`.bufferedReader()) {
    val (n, t) = readLine().split(" ").map { it.toInt() }

    val list = mutableListOf<Pair<Int, Int>>()

    repeat(n) {
        val (num, height) = readLine().split(" ").map { it.toInt() }
        list.add(num to height)
    }

    list.sortBy { it.first }
    var answer = 0
    for (i in 0 until list.size - 1) {
        // 바닥에 비치는 그림자 길이
        val shadowBottom = list[i].second / t

        // 나무에 비치는 그림자 길이
        val shadowNextTree = t / (shadowBottom - list[i + 1].first + list[i].first)
        if (list[i + 1].first > list[i].first + shadowNextTree) {
            if (t < shadowBottom - list[i + 1].first + list[i].first) {
                answer += list[i + 1].second
            } else {
                answer += shadowNextTree
            }
        } else if (list[i + 1].first > list[i].first + shadowNextTree) {
            answer += 0
        }


    }
    bw.write("$answer")

    closeBW()
    close()
} // 경우의 수 다시 생각해보기..