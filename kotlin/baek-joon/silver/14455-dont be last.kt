import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.collections.HashMap
import kotlin.math.min

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = hashMapOf<String, Int>()
    repeat(n) {
        val (name, amount) = readLine().split(" ")
        map[name] = map.getOrDefault(name, 0) + amount.toInt()
    }

    var cnt = Int.MAX_VALUE

    for (m in map) {
        cnt = min(cnt, m.toPair().second)
    }

    if (map.size < 7) cnt = 0

    var cntSecond = Int.MAX_VALUE

    for (m in map) {
        if (m.toPair().second == cnt) continue
        cntSecond = min(cntSecond, m.toPair().second)
    }

    var answer = ""
    var res = 0

    for (m in map) {
        if (m.toPair().second == cntSecond) {
            answer = m.toPair().first
            res++ // 마리수 확인
        }
    }

    bw.write(if (res == 1) answer else "Tie")


    closeBW()
    close()
}