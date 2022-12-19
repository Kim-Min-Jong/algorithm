import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import java.math.BigInteger

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toBigInteger()
    var isInPalindrome = false
    for(i in 2..10) {
        val str = n.toString(i)
        if(str == str.reversed()){
            bw.write("$i $str\n")
            isInPalindrome = true
        }
    }
    if(isInPalindrome.not())
        bw.write("NIE")

    bw.flush()
    bw.close() 
    close()
}