import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val dist = readLine().split(" ").map{it.toLong()}
    val gas = readLine().split(" ").map{it.toLong()}

    var minGas = gas[0]
    var sum = 0L

    for(i in 0 until n-1){
        if(minGas > gas[i])
            minGas = gas[i]
        sum += minGas * dist[i]
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}