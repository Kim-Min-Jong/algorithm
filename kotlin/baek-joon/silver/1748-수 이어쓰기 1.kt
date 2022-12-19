import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val str = readLine().toInt()
    var num = 10
    var sum = 1
    var cnt = 0
    for(i in 1..str){
        if(i % num == 0){
            sum++
            num *= 10
        }
        cnt += sum
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}