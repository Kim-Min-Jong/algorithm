import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main(args: Array<String>)  = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    
    repeat(n) {
        val sb = StringBuilder()
        val length = readLine().toInt()
        val plus = length / 5
        val surplus = length % 5
        (0 until plus).forEach {
            sb.append("++++ ")
        }
        (0 until surplus).forEach{
            sb.append("|")
        }
        bw.write(sb.toString() +"\n")
    }


    bw.flush()
    bw.close()
    close()

}