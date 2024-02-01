import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main(args: Array<String>)  = with(System.`in`.bufferedReader()) {

    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int,Int>>()
    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        list.add(x to y)
    }
    val southest = list.sortedBy { it.second }.first()

    bw.write("${southest.first} ${southest.second}")
    
    bw.flush()
    bw.close()
    close()

}