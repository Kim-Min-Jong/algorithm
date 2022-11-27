import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var (a, k) = readLine().split(" ").map{it.toInt()}
    var cnt = 0
    while(true) {
        if(a == k){
            bw.write("$cnt")
            break
        }
        if(k % 2 == 0 && k >= a * 2){
            k /= 2
        }
        else{
            k -= 1
        }
        cnt++
    }
    
    bw.flush()
    bw.close()
    close()
}