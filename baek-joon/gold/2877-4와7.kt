import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.Math.abs
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
        val n = readLine().toInt()
    val list = mutableListOf<Int>()
    val sb = StringBuilder()
    var num = 1
    var sum = 0
    while(true) {
        if(sum >= 1000000000)
            break
        sum += num * 2
        num *= 2
        list.add(sum)
    }
    var idx = 0
    list.forEach {
        if(n > it) {
            idx = list.indexOf(it)
            return@forEach
        }
    }

    idx += 1
    val decimal = abs(list[idx] - n - list[idx - 1] - 1)
    val str = Integer.toBinaryString(decimal)

    val len = idx - str.length
    for(i in 0 until len) {
        sb.append("0")
    }
    sb.append(str)
    bw.write(sb.toString().replace('0','4').replace('1','7'))

    bw.flush()
    bw.close()
    close()
}