import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){

    val n = readLine().toInt()
    val list = readLine().split(" ").map{it.toInt()}
    val gcdList = mutableListOf<Int>()
    for(i in 1 until list.size){
        val gcd = gcd(list[0],list[i])
        gcdList.add(gcd)
    }

    for(i in 0 until n-1){
        bw.write("${list[0]/gcdList[i]}/${list[i+1]/gcdList[i]}\n")
    }

    bw.flush()
    bw.close()
    close()
}
fun gcd(n:Int, m:Int):Int{
    return if(n < m){
        if(n == 0) m else gcd(n, m % n)
    }else{
        if(m == 0) n else gcd(m, n % m)
    }
}