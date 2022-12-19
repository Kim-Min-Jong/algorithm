import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max
import kotlin.math.pow

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (p1,p2,p3,x) = readLine().split(" ").map{it.toLong()}
    var list = mutableListOf<Long>()
    val max = 1000000000000000000
    for(i in 0 until 60) {
        if(p1.toDouble().pow(i.toDouble()).toLong() > max)
            break
        for(j in 0 until 60) {
            if((p1.toDouble().pow(i.toDouble())* p2.toDouble().pow(j.toDouble())).toLong() > max)
                break
            for(k in 0 until 60) {
                if(i+j+k == 0) continue
                if((p1.toDouble().pow(i.toDouble())* p2.toDouble().pow(j.toDouble())* p3.toDouble().pow(k.toDouble())).toLong() > max)
                    break
                list.add((p1.toDouble().pow(i.toDouble()) * p2.toDouble().pow(j.toDouble()) * p3.toDouble().pow(k.toDouble())).toLong())
            }
        }
    }
    list.sort()
    bw.write("${list[x.toInt()-1]}")

    bw.flush()
    bw.close()
    close()
}