import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = readLine().toCharArray()
    val a = arr.count { it == 'A' }
    val b = n - a
    
    when {
        a > b -> bw.write("A")
        a < b -> bw.write("B")
        else -> bw.write("Tie")
    }
    
    bw.flush()
    bw.close()
    close()
}