import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.lang.Integer.max
import java.lang.Math.abs
import java.math.BigInteger
import java.util.*
import kotlin.math.min
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val list = mutableListOf<Int>()
    val chkList = mutableListOf<Int>()
    list.add(n)
    chkList.add(n)
    var tmp = 0
    while(true) {
        tmp = list.last()
        val tmpList = tmp.toString().chunked(1)
        var add = 0
        tmpList.forEach {
            add += pow(it.toInt(), m)
        }
        if(add in chkList){
            tmp = add
            break
        }
        list.add(add)
        chkList.add(add)
    }
    val idx = list.indexOf(tmp)
    bw.write("${idx}")

    bw.flush()
    bw.close()
    close() 
}
fun pow(a: Int, n :Int) :Int {
    var ans = 1
    for(i in 0 until n) {
        ans *= a
    }
    return ans
}