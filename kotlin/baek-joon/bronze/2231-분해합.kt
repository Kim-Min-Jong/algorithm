import java.io.*
fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()

        var sum = 0
        var res = 0

        for(i in 0..n){
                sum = i.toString().chunked(1).map{it.toInt()}.sum()
                if(i + sum == n){
                        res = i
                        break
                }
        }
        if(res == null) println(0)
        else println(res)
}