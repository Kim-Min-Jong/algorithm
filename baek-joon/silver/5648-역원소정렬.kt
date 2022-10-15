import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val sc = Scanner(System.`in`)
    val list = mutableListOf<String>()
    val n = sc.nextInt()
    for(i in 1..n){
        val str = sc.next().reversed()
        list.add(str)
    }
    list.map{it.toLong()}.sorted().forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
    close()
}
