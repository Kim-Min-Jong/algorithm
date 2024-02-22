import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = hashMapOf<String, Int>()
    val dayCountMap = hashMapOf<String, Int>()

    repeat(n) {
        val (name, day, startTime, endTime) = readLine().split(" ")

        val (startHour, startMinute) = startTime.split(":").map { it.toInt() }
        val (endHour, endMinute) = endTime.split(":").map { it.toInt() }

        val broadcastingTime = (endHour - startHour) * 60 + (endMinute - startMinute)

        map[name] = map.getOrDefault(name, 0) + broadcastingTime
        dayCountMap[name] = dayCountMap.getOrDefault(name, 0) + 1
    }

    val keys = dayCountMap.filter { it.value >= 5 }.map { it.key }
    val result = map.filterKeys { keys.contains(it) }.filter { it.value >= 3600 }.toSortedMap()

    if (result.isEmpty()) {
        bw.write("-1")
    } else {
        result.forEach {
            bw.write("${it.key}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}