import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, pivot) = readLine().split(" ").map{it.toInt()}
    val list = mutableListOf<String>()
    repeat(n) {
        list.add(readLine())
    }
    list.groupBy { it }.map{it.key to it.value.size}.filter{it.first.length >= pivot}.sortedWith(
        compareByDescending<Pair<String, Int>> { it.second }
        .thenByDescending { it.first.length }.thenBy { it.first })
        .forEach{
            bw.write("${it.first}\n")
        }


    bw.flush()
    bw.close()
    close()
} //Collection 함수 활용