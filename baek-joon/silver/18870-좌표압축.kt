import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var arr = readLine().split(' ').map{it.toInt()}
    val sortedArr = arr.distinct().sorted()
    for(i in 0 until n){
        bw.write("${sortedArr.binarySearch(arr[i])} ")
    }
    bw.flush()
    bw.close()
    close()
}