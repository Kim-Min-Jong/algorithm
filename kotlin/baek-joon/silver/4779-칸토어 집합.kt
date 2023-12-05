import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var result: Array<String>
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        try{
            val n = readLine().toInt()
            result = Array(pow3(n)) { "-" }
            cantor(0, pow3(n))
            bw.write(result.joinToString("")+"\n")
        } catch (e: Exception) {
            break
        }
    }

    bw.flush()
    bw.close()
    close()

}
fun pow3(n: Int): Int {
    var res = 1
    for (i in 0 until n) {
         res *= 3
    }
    return res
}
fun cantor(start: Int, end: Int) {
    if(end == 1)
        return
    for (i in start + end / 3 until  start +(end / 3) * 2)
        result[i] = " "
    cantor(start, end / 3) // 왼쪽
    cantor(start + end / 3  * 2, end / 3) // 오른쪽
}