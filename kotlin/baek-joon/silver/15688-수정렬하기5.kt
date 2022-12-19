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
// 이 코드는 실제로 돌리면 시간 초과가 난다...
// 이 로직을 그대로 자바로 바꾸면 시간 초과가 해소된다..
// 코틀린은 생각보다 느리다..