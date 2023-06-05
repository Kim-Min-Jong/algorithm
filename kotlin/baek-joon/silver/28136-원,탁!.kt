import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}.toMutableList()
    var res = 0
    list.add(list[0])
    for(i in 0 until n) {
        if(list[i] >= list[i+1]) res++
    }
    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}