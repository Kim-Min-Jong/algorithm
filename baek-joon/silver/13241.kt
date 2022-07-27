import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val (a,b) = readLine().split(" ").map{it.toLong()}
    bw.write("${lcm(a,b)}\n")


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
fun lcm(n:Long, m:Long):Long{
    return (n * m) / gcd(n, m)
}