import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var kg = readLine().toLong()
    var cnt = 0L
    while(true) {
        if(kg % 5L == 0L) {
            cnt += (kg / 5L)
            bw.write("$cnt")
            break
        } else {
            kg -= 3L
            cnt += 1
        } 
        if(kg < 0L) {
            bw.write("-1")
            break
        }
        
    }

    bw.flush()
    bw.close()
    close()
}