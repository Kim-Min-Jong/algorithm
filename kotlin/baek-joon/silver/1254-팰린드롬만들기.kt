import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    var cnt = 0
    for(i in str.indices) {
        if(isPalindrome(str.substring(i)))
            break
        cnt++
    }
    bw.write("${cnt+str.length}")

    bw.flush()
    bw.close()
    close()
}
fun isPalindrome(s: String): Boolean {
    val reversedStr = s.reversed()
    if (str == reversedStr) {
        return true
    }
    return false
}