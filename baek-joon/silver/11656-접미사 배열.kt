import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    var str = readLine()
    val list2 = mutableListOf<String>()
    for(i in str.length - 1 downTo 0) {
        list2.add(str.slice(i until str.length))
    }
    list2.sorted().forEach{
        bw.write("$it\n")
    }


    bw.flush()
    bw.close()
    close()
}