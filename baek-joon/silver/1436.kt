import java.io.*

fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        var n = readLine().toInt()
        var cnt = 1
        var num = 666
        while(cnt != n){
                num++
                if(num.toString().contains("666")){
                        cnt++
                }
        }
        print(num)
}