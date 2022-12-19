import java.io.*
import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){

    val n = readLine().toInt()
    val answer = mutableListOf<List<Long>>()
    val result = mutableListOf<Long>()
    var sum = 0L
    repeat(n){
        sum = 0L
        val list = readLine().split(" ").map{it.toLong()}
        val arr = list.slice(1 until list.size)
        combination(answer,arr,Array<Boolean>(arr.size){false},0,2)
        for(i in answer){
            val gcd = gcd(i[0],i[1])
            sum += gcd
        }
        result.add(sum)
    }
    bw.write("${result[0]}\n")
    for(i in 1 until result.size){
        bw.write("${result[i]-result[i-1]}\n")
    }
    
    bw.flush()
    bw.close()
    close()
}
fun gcd(n:Long, m:Long):Long{
    return if(n < m){
        if(n == 0L) m else gcd(n, m % n)
    }else{
        if(m == 0L) n else gcd(m, n % m)
    }
}
fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
    if(target == 0) {
        answer.addAll( listOf(el.filterIndexed { index, t -> ck[index] }) )
    } else {
        for(i in start until el.size) {
            ck[i] = true
            combination(answer, el, ck, i + 1, target - 1)
            ck[i] = false
        }
    }
}