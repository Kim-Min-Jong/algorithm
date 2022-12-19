import java.util.*
import java.io.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val (n,k) = readLine().split(" ").map{it.toInt()}
    var arr = DoubleArray(n){0.0}
    var arr1 = doubleArrayOf()
    var arr2 = doubleArrayOf()
    for(i in 0 until n){
        val num = readLine().toDouble()
        arr[i] = num
    }
    // 절사평균 배열
    arr1 = arr.sortedArray().sliceArray(k until arr.size-k)

    arr2 = arr.sortedArray()

    for(i in 0..k){
        arr2[i] = arr1[0]
        arr2[arr2.size-i-1] = arr1[arr1.size-1]
    }
    
    bw.write("%.2f\n".format(arr1.average()))
    bw.write("%.2f\n".format(arr2.average()))
    bw.flush()
    bw.close()
    this.close()
}