import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    data class Student(val num: Int, val name: String)
    fun intListInput()  = readLine().split(" ").map { it.toInt() }
    while(true) {
        var num = 0
        val (w, n) = intListInput()
        if (w == 0 && n == 0) break

        val orderList = mutableListOf<Student>()
        val map = hashMapOf<String, Int>()
        val demeritMap = hashMapOf<String, Int>(
            "TT" to 75,
            "TX" to 50,
            "PR" to 80,
            "RT" to 30,
            "AP" to 25,
            "PX" to 60,
        )
        repeat(n) {
            val (name, code) = readLine().split(" ")
            if (orderList.find { it.name == name } == null) {
                orderList.add(Student(num, name))
                num++
            }
            map[name] = map.getOrDefault(name, 0) + demeritMap[code]!!
        }

        val over100points = map.filter { it.value >= 100 }.map { it.key }
        val order = mutableListOf<Int>().apply {
            over100points.forEach { name ->
                orderList.find { it.name == name }?.let{
                    add(it.num)
                }
            }
        }

        val orderedOver100Points = over100points zip order

        if (orderedOver100Points.isEmpty()) {
            bw.write("Week $w No phones confiscated\n")
        } else {
            bw.write("Week $w ${orderedOver100Points.sortedBy { it.second }.joinToString(",") { it.first }}\n")
        }

    }

    bw.flush()
    bw.close()
    close()
}