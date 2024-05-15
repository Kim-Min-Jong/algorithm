import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, q) = readLine().split(" ").map { it.toInt() }
    var str = readLine()

    repeat(q) {
        val (command, l, r) = readLine().split(" ").map { it.toInt() }
        if (command == 1) {
            bw.write("${countAlphabetSet(str)}\n")
        } else {
            str = nextAlphabet(str, l - 1, r - 1)
        }
    }

    bw.flush()
    bw.close()
    close()
}

fun countAlphabetSet(str: String): Int {
    var currentAlphabet = str[0]
    var cnt = 1
    for (i in 1 until str.length) {
        if (currentAlphabet == str[i]) {
            currentAlphabet = str[i]
            continue
        } else {
            currentAlphabet = str[i]
            cnt++
        }
    }
    return cnt
}

fun nextAlphabet(
    str: String,
    fromIndex: Int,
    toIndex: Int
): String {
    val tmp = str.toCharArray()

    for (i in fromIndex .. toIndex) {
        if (tmp[i] == 'Z') tmp[i] = tmp[i] - 25
        else tmp[i] = tmp[i] + 1
    }
    return tmp.concatToString()
} // 추가 반례 찾기