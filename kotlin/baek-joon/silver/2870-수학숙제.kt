import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.regex.Pattern

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<BigInteger>()
    val pattern = Pattern.compile("\\d+")

    repeat(n) {
        val str = readLine()
        val match = pattern.matcher(str)
        while (match.find()) {
            list.add(BigInteger(match.group()))
        }
    }

    list.sorted().forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
    close()
}