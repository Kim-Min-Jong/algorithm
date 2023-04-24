import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array<Int>(n){0}
    val sb = StringBuilder()
    for(i in 0 until n){
        arr[i] = Integer.parseInt(readLine())
    }

    Arrays.sort(arr)
    for(i in arr){
        sb.append(i).append("\n")
    }
    println(sb)

}
// kotlin은 시간초과 java로 변경했더니 정답처리