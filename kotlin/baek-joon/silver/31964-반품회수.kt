import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val x = readLine().split(" ").map { it.toInt() }
    val t = readLine().split(" ").map { it.toInt() }

    var time = max(x.last(), t.last())

    for (i in n - 2 downTo 0) {
        // 이동 시간 추가
        time += x[i+1] - x[i]
        // 추가 된 시간이 물건 내놓는 시각 보다 크다면 최소는 물건 내놓는 시각
        if (time < t[i]) {
            time = t[i]
        }
    }

    // 시작부터 거리 추가
    bw.write("${time + x.first()}")

    bw.flush()
    bw.close()
    close()
}
