import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var (n, m) = readLine().split(" ").map{it.toInt()}
    var cnt = 1
    var a = -999
    while(m != n){
        cnt++
        a = m
        if(m % 10 == 1){
            m /= 10
        } else if(m % 2 == 0){
            m /= 2
        }
        if(a == m) {
            break
        }
    }
    if(a == m) {
        bw.write("-1")
    } else{
        bw.write("$cnt")
    }

    bw.flush()
    bw.close()
    close()
}