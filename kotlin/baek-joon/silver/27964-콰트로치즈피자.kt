import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ")
    val set = mutableSetOf<String>()
    list.forEach{
        if(it.length >= 6){
            val end = it.endsWith("Cheese")
            if(end) {
                set.add(it)
            }
        }
    }
    bw.write(if(set.size >= 4) "yummy" else "sad")


    bw.flush()
    bw.close()
    close()
}