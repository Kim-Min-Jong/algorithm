import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
        val n = readLine().toInt()
    val arr = LongArray(1_000_001){0L}
    arr[1] = 1L
    arr[2] = 2L
    arr[3] = 4L
    repeat(n){
        val k = readLine().toInt()
        for(i in 4..k){
            arr[i] = (arr[i-1]+arr[i-2]+arr[i-3]) % 1_000_000_009L
        }
        bw.write(arr[k].toString()+"\n")
    }
    bw.flush()
    bw.close()
    close()
}