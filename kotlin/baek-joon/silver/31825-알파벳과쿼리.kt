import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (n, q) = readLine().split(" ").map { it.toInt() }
    var str = readLine()

    repeat(q) {
        var (command, l, r) = readLine().split(" ").map { it.toInt() }
        l--
        r--
        if (command == 1) {
            var cnt = 1
            for (i in l + 1 .. r) {
                if (str[i] != str[i-1]) cnt++
            }
            bw.write("$cnt\n")
        } else {
            str = nextAlphabet(str, l, r)
        }
    }

    bw.flush()
    bw.close()
    close()
}

fun nextAlphabet(
    str: String,
    fromIndex: Int,
    toIndex: Int
): String {
    val tmp = str.toCharArray()

    for (i in fromIndex..toIndex) {
        tmp[i] = ((tmp[i] - 'A' + 1) % 26 + 'A'.code).toChar()
    }
    return tmp.concatToString()
} // 해결