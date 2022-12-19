import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val n = readLine().toInt()
    var i = 1

    repeat(n){
        val list = readLine().split(" ").map{it.toInt()}
        val scoreList = list.slice(1 until list.size).sortedDescending()
        var gap = 0
        var tmp = 0
        for(i in 1 until scoreList.size){
            tmp = abs(scoreList[i-1]-scoreList[i])
            if(tmp > gap)
                gap = tmp
        }

        bw.write("Class ${i++}\n")
        bw.write("Max ${scoreList.maxOrNull()!!}, Min ${scoreList.minOrNull()!!}, Largest gap ${gap}\n")

    }

    bw.flush()
    bw.close()
    close()
}