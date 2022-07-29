import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val (n,m) = readLine().split(":").map{it.toInt()}

    val gcd = gcd(n,m)
    bw.write("${n/gcd}:${m/gcd}")
    
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