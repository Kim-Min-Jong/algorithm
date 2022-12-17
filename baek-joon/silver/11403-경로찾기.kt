import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<MutableList<Int>>()

    repeat(n) {
        list.add(readLine().split(" ").map{it.toInt()}.toMutableList())
    }

    for(i in 0 until n) {
        for (j in 0 until n) {
            for (k in 0 until n) {
                if(list[j][k] == 1 || (list[j][i] == 1 && list[i][k] == 1))
                    list[j][k] = 1
            }
        }
    }

    list.forEach { innerList->
        innerList.forEach{
            bw.write("$it ")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    close()
}