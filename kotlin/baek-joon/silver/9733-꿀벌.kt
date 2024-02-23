import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
val list = mutableListOf<Int>()
lateinit var result: Array<String>
lateinit var map: HashMap<Long, Long>
fun main() = with(System.`in`.bufferedReader()){
    val list = mutableListOf<String>()
    while(true) {
        val input = readLine()
        if(input == "") break
        input.split(" ").forEach {
            list.add(it)
        }
    }
    val ll = (list).groupBy { it }.map{it.key to it.value.size}.toMap()
    val sum = ll.toList().sumOf { it.second }.toDouble()
    bw.write("Re ${ll["Re"] ?: 0} ${String.format("%.2f", (ll["Re"] ?: 0) / sum)}\n")
    bw.write("Pt ${ll["Pt"] ?: 0} ${String.format("%.2f", (ll["Pt"] ?: 0) / sum)}\n")
    bw.write("Cc ${ll["Cc"] ?: 0} ${String.format("%.2f", (ll["Cc"] ?: 0) / sum)}\n")
    bw.write("Ea ${ll["Ea"] ?: 0} ${String.format("%.2f", (ll["Ea"] ?: 0)/ sum)}\n")
    bw.write("Tb ${ll["Tb"] ?: 0} ${String.format("%.2f", (ll["Tb"] ?: 0) / sum)}\n")
    bw.write("Cm ${ll["Cm"] ?: 0} ${String.format("%.2f", (ll["Cm"] ?: 0) / sum)}\n")
    bw.write("Ex ${ll["Ex"] ?: 0} ${String.format("%.2f", (ll["Ex"] ?: 0) / sum)}\n")
    bw.write("Total ${sum.toInt()} 1.00")


    bw.flush()
    bw.close()
    close()
}