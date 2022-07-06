import java.io.*

fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().split(" ").map{it.toInt()}
        var e = readLine().split(" ").map{it.toInt()}
        var sum = 0
        var max = 0
        for(i in 0 until n[0]){
                for(j in i+1 until n[0]){
                        for(k in j+1 until n[0]){
                                sum = e[i]+e[j]+e[k]
                                if(sum > max && sum <= n[1]){
                                        max = sum
                                }

                        }
                }
        }
        println(max)
}
