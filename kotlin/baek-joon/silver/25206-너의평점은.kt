import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = mutableListOf<Triple<String, String, String>>()
    repeat(20) {
        val (subject, mark, grade) = readLine().split(" ")
        list.add(Triple(subject, mark, grade))
    }
    var total = 0.0
    val filteredList = list.filter { it.third != "P" }
    val size = filteredList.sumOf { it.second.toDouble() }
    filteredList.forEach{
        val grade = when(it.third) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            "F" -> 0.0
            else -> 0.0
        }
        total += it.second.toDouble() * grade
    }

    bw.write(String.format("%.6f",total/size))

    bw.flush()
    bw.close()
    close()
}