import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val tc = readLine().toInt()
    repeat(tc) {
        val n = readLine().toInt()
        val firstKeys = readLine().split(" ")
        val secondKeys = readLine().split(" ")
        val secrets = readLine().split(" ")

        val map = mutableMapOf<Int, String>()

        for (i in 0 until n) {
            map[firstKeys.indexOf(secondKeys[i])] = secrets[i]
        }
        bw.write(map.toSortedMap().values.joinToString(" ") +"\n")
    }

    bw.flush()
    bw.close()
    close()
}