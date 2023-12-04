import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { 0 }
    val intervalArr = Array(n - 1) { 0 }
    var res = 0
    for (i in 0 until n) {
        arr[i] = readLine().toInt()
    }
    for (i in 0 until arr.size - 1) {
        intervalArr[i] = arr[i + 1] - arr[i]
    }
    var gcd = gcd(intervalArr[0], intervalArr[1])
    for(i in 2 until intervalArr.size) {
        gcd = gcd(gcd, intervalArr[i])
    }
    intervalArr.forEach {
        res += (it - 1) / gcd
    }

    bw.write("$res")

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