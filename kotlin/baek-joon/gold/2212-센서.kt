import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val k = readLine().toInt()

    if(k >= n) bw.write("0")
    else {
        val list = readLine().split(" ").map{it.toInt()}.sorted()
        var sum = 0
        val subList = mutableListOf<Int>()
        for(i in 1 until list.size ) {
            sum = list[i] - list[i-1]
            subList.add(sum)
        }
        subList.sortDescending()
        var res = 0
        for(i in k-1 until subList.size ) {
            res += subList[i]
        }
        bw.write("$res")
    }

    bw.flush()
    bw.close()
    close()
}