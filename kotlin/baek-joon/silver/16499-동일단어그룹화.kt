import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n){
        val str = readLine().split("").sorted().joinToString("")
        list.add(str)
    }
    bw.write("${list.groupBy { it }.size}")

    bw.flush()
    bw.close()
    close()
}