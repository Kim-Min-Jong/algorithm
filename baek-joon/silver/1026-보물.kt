import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    val list1 = readLine().split(" ").map{it.toInt()}.sorted()
    val list2 = readLine().split(" ").map{it.toInt()}.sortedByDescending { it }
    var sum = 0
    for(i in 0 until n){
        sum += list1[i]*list2[i]
    }
    bw.write("$sum")

    bw.flush()
    bw.close()
    this.close()
}