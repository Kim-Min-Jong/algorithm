import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){

    var n = readLine()
    val regix = "(pi|ka|chu)*".toRegex()
    n = n.replace(regix,"")

    if(n.isEmpty()){
        bw.write("YES")
    }else{
       bw.write("NO")
    }

    bw.flush()
    bw.close()
    close()
} // 간단한 정규표현식 문제