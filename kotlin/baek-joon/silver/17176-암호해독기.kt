import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val plain = IntArray(53) { 0 }
    val list = readLine().split(" ").map { it.toInt() }.forEach{
        plain[it]++
    }
    val secret = readLine()

    secret.forEach {
        when(it) {
            ' ' -> plain[0]--
            in 'a'..'z' -> plain[(it - 70).code]--
            else -> plain[(it - 64).code]--
        }
    }

    var isMatching = true

    plain.forEach {
        if (it != 0) {
            isMatching = false
            return@forEach
        }
    }

    bw.write(if (isMatching) "y" else "n")

    bw.flush()
    bw.close()
    close()
}