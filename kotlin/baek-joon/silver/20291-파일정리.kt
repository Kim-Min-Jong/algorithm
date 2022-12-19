import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n){
        val v = readLine().split(".")
        list.add(v[1])
    }
    val a = list.groupBy { it }.map{it.key to it.value.size}.toList().sortedBy { it.first }
    a.forEach{
        bw.write("${it.first} ${it.second}\n")
    }

    bw.flush()
    bw.close()
    close()
}