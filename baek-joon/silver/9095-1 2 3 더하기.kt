import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val arr = IntArray(12){0}
    arr[1] = 1
    arr[2] = 2
    arr[3] = 4
    repeat(n){
        val k = readLine().toInt()
        for(i in 4..k){
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3]
        }
        bw.write(arr[k].toString()+"\n")
    }
    bw.flush()
    bw.close()
    this.close()
}
