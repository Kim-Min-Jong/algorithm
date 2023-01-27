import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().split(" ").map{it.toInt()}
    val burgers = readLine().split(" ").map{it.toInt()}.sortedDescending()
    val sides = readLine().split(" ").map{it.toInt()}.sortedDescending()
    val beverages = readLine().split(" ").map{it.toInt()}.sortedDescending()
    val min = num.minOrNull()
    var setSum = 0.0
    var subSum = 0

    for(i in 0 until min!!) {
        setSum += (burgers[i] + sides[i] + beverages[i]) * 0.9
    }
    for (i in min until burgers.size) {
        subSum += burgers[i]
    }
    for (i in min until sides.size) {
        subSum += sides[i]
    }
    for (i in min until beverages.size) {
        subSum += beverages[i]
    }
    bw.write("${burgers.sum() + sides.sum() + beverages.sum()}\n")
    bw.write("${setSum.toInt() + subSum}")

    bw.flush()
    bw.close()
    close()
}