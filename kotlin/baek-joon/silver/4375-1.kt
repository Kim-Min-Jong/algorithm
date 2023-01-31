import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val tc = readLine() ?: break
        var num = 0
        var i = 1
        while(true) {
            num = num * 10 + 1
            num %= tc.toInt()
            if(num == 0){
                bw.write("$i\n")
                break
            }
            i++
        }
    }
    
    bw.flush()
    bw.close()
    close()
}