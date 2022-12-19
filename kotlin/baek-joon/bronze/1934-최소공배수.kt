import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().toInt()
    repeat(a){
        val (n,m) = readLine().split(" ").map{it.toInt()}
        bw.write("${lcm(n,m)}\n")
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
fun lcm(n:Int, m:Int):Int{
    return (n * m) / gcd(n, m)
}
