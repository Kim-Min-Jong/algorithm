import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val c = 5
    var sum = 0
    repeat(c){
        var m = readLine().toInt()
        if(m < 40) m = 40
        sum += m
    }
    bw.write("${sum/c}")
    bw.flush()
    bw.close()
    this.close()
}