import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val str1 = readLine()
    var str2 = readLine()

    bw.write("${abDfs(str1, str2)}")

    bw.flush()
    bw.close()
    close()
}
fun abDfs(str1: String, str2: String): Int {
    if(str1.length == str2.length) {
        if(str1 == str2){
            return 1;
        }
        return 0;
    }
    var answer = 0
    if(str2.first() == 'B') {
        answer += abDfs(str1, str2.substring(1).reversed())
    }
    if(str2.last() == 'A') {
        answer += abDfs(str1, str2.substring(0 until str2.lastIndex))
    }
    return if(answer > 0) 1 else 0
}
// 12904-A와B 처럼 반복문을 통해 해결하려 했으나 잘 안되어 검색후 dfs방법을 찾아 해결할 수 있었음