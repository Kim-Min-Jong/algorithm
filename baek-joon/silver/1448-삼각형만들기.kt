import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val arr = Array<Int>(n){0}
    var cnt = 1
    for(i in 0 until n){
        arr[i] = readLine().toInt()
    }
    arr.sortDescending()

    for(i in 0 until arr.size-2){
        if(arr[i] < arr[i+1] + arr[i+2]){
            bw.write("${arr[i] + arr[i+1] + arr[i+2]}")
            cnt = 0
            break
        }
    }
    if(cnt == 1) bw.write("-1")

    bw.flush()
    bw.close()
    close()
}