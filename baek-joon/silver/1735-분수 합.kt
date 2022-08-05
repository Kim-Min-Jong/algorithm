import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val fraction1 = readLine().split(" ").map{it.toInt()}
    val fraction2 = readLine().split(" ").map{it.toInt()}
    val denominator = lcm(fraction1[1],fraction2[1])  // 분모
    val numerators = intArrayOf((denominator/fraction1[1])*fraction1[0],(denominator/fraction2[1])*fraction2[0])

    val fractionSum = gcd(numerators.sum(),denominator)

    bw.write("${numerators.sum() / fractionSum} ${denominator / fractionSum}")

    bw.flush()
    bw.close()
    this.close()
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
