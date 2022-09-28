import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val m = readLine().toInt()
    repeat(m){
        val n = readLine()
        val reversedN = n.reversed().toInt()
        val intN = n.toInt()
        val sum = (intN + reversedN).toString()
        val reversedSum = sum.reversed()
        val answer = if(sum.equals(reversedSum)){
            "YES"
        } else{
            "NO"
        }
        bw.write(answer+"\n")
    }


    bw.flush()
    bw.close()
    close()
}