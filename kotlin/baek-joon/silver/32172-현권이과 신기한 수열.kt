import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val checked = BooleanArray(600_001) { false }
    var A = 0
    checked[0] = true
    for (i in 1 .. n) {
        // 중복 체크
        checked[A] = true
        var next = A - i

        // 추가 조건
        if (next < 0 || checked[next]) {
            next = A + i
        }

        A = next
    }

    bw.write("$A")

    closeBW()
    close()
}