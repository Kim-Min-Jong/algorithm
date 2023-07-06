import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val (doughPrice, toppingPrice) = readLine().split(" ").map{it.toInt()}
    val doughCalorie = readLine().toInt()
    val toppingCalories = mutableListOf<Int>()
    repeat(n){
        toppingCalories.add(readLine().toInt())
    }
    toppingCalories.sortDescending()
    var total = doughCalorie / doughPrice // 토핑 x
    for(i in 1..toppingCalories.size) {
        val price = doughPrice + toppingPrice * i
        val tmp = doughCalorie + toppingCalories.subList(0, i).sum()
        total = max(total, tmp / price)
    }
    bw.write("${total.toInt()}")
    bw.flush()
    bw.close()
    close()
}