import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val num = readLine().toInt()
        if (num == - 1) break
        val list = isPerfectNumber_9506(num)
        when(num == list.sum()) {
            true -> {
                val str = list.joinToString(" + ")
                bw.write("$num = $str\n")
            }
            false -> bw.write("$num is NOT perfect.\n")
        }
    }
    bw.flush()
    bw.close()
    close()
}

fun isPerfectNumber_9506(n: Int): List<Int> {
    val list = arrayListOf<Int>()
    for (i in 1 until n) {
        if(n % i == 0)
            list.add(i)
    }
    return list
}