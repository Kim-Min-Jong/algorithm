import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){

    val input = readLine().split(" ").map{it.toInt()}
    val list = mutableListOf<Int>()
    val dp = IntArray(10001)
    dp[0] = 1
    repeat(input[0]){
        val m = readLine().toInt()
        list.add(m)
    }
    for(i in list){
        for(j in 1..input[1]){
            if(j - i >= 0)
                dp[j] += dp[j - i]
        }
    }
    bw.write("${dp[input[1]]}")

    bw.flush()
    bw.close()
    close()
}