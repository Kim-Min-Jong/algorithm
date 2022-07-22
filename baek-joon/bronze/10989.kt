import java.util.*
import java.io.*

fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()
        
        val list = IntArray(10001)

        for (i in 0 until n) {
                list[readLine().toInt()]++
        }
        for (i in 1..10000) {
                bw.write("$i\n".repeat(list[i]))
        }

        bw.flush()
        bw.close()
        this.close()
}