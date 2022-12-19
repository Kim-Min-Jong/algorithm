import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, h, w) = readLine().split(" ").map{it.toInt()}
    val arr = CharArray(n){'?'}
    for(i in 0 until h) {
        val str = readLine()
        for(j in 0 until n * w) {
            val ch = str[j]
            if(ch == '?')
                continue
            else
                arr[j/w] = ch 
        }
    }
    arr.forEach {
        bw.write("$it")
    }

    bw.flush()
    bw.close()
    close()
}