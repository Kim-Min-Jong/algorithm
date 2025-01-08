import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    var str = readLine()
    
    while ("()" in str) {
        str = str.replace("()", "")
    }
        
    bw.write("${str.count { it == ')' }}")

    closeBW()
    close()
}