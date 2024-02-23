import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val map = mutableMapOf<String, Double>()
    repeat(n) {
        val (kind, amount) = readLine().split(" ")
        map[kind] = map.getOrDefault(kind, 0.0) + amount.toDouble()
    }
    val list = map.toList()
    var isDelicious = false

    mainLoop@for (i in 0 until list.size) {
        for (j in i + 1 until list.size) {
            when {
                list[i].second > list[j].second -> {
                    if (floor(list[j].second * 1.618).toInt() == list[i].second.toInt()) {
                        isDelicious = true
                        break@mainLoop
                    }
                }
                list[i].second < list[j].second -> {
                    if (floor(list[i].second * 1.618).toInt() == list[j].second.toInt()) {
                        isDelicious = true
                        break@mainLoop
                    }
                }
                else -> {
                    continue
                }
            }
        }
    }

    bw.write(if(isDelicious) "Delicious!" else "Not Delicious...")


    bw.flush()
    bw.close()
    close()
}