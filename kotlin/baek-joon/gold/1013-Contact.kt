import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    // (100+1+ | 01)+
    val regex = "^(100+1+|01)+$".toRegex()
    repeat(n) {
        val tc = readLine()
        if(regex.matches(tc)) {
            bw.write("YES\n")
        } else bw.write("NO\n")
    }

    bw.flush()
    bw.close()
    close()
} 
// 정규표현식 문제
// 정규표현식 문법은 다 외우지 않아서 검색 후 구현