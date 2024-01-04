import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (s, e, q) = readLine().split(" ").map { convertHHMM(it) }
    val entry = hashSetOf<String>()
    val exit = hashSetOf<String>()
    var res = 0
    while (true) {
        val str = readLine() ?: break
        val input = str.split(" ")

        val convertedTime = convertHHMM(input[0])
        if (convertedTime <= s) {
            entry.add(input[1])
        } else if (convertedTime in e..q) {
            exit.add(input[1])
        }
    }

    for(i in exit) {
        if(i in entry) res++
    }
    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}

fun convertHHMM(time: String) = time.replace(":", "").toInt()