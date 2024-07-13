import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.ceil

val bw = BufferedWriter(OutputStreamWriter(System.out))

data class TelRecords(val time: Int, val name: String)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<TelRecords>()

    repeat(n) {
        val (time, name) = readLine().split(" ")
        val (hour, minute) = time.split(":").map { it.toInt() }
        list.add(TelRecords(hour * 60 + minute, name))
    }

    list.groupBy { it.name }
        .map { it.key to it.value.sumOf { records -> records.time } }
        .sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first })
        .forEach {
            val price = if (it.second <= 100) {
                10
            } else {
                10 + ((ceil((it.second - 100) / 50.0)) * 3).toInt()
            }

            bw.write("${it.first} $price\n")
        }


    bw.flush()
    bw.close()
    close()
} // ...?