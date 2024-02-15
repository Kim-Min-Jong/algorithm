import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    var isPalindrome = false
    repeat(n) {
        val num = readLine().toInt()
        for (i in 2..64) {
            val palindrome =  num.toStringRadix(i)
            isPalindrome = isPalindrome(palindrome)
            if (isPalindrome) break
        }
        bw.write(if (isPalindrome) "1\n" else "0\n")
    }


    bw.flush()
    bw.close()
    close()
}
fun Int.toStringRadix(n: Int): String {
    val sb = StringBuilder()
    var num = this
    if (num == 0) return "0"
    while(num > 0) {
        if (num % n < 10) {
            sb.append(num % n)
        } else {
            sb.append((num % n - 10).toChar() + 'A'.code)
        }
        num /= n
    }
    return sb.reversed().toString()
}

fun isPalindrome(palindrome: String): Boolean {
    var start = 0
    var end = palindrome.length - 1
    for (i in 0 until palindrome.length / 2) {
        if (palindrome[start] == palindrome[end]) {
            start++
            end--
        } else {
            return false
        }
    }
    return true
}