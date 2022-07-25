import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val list1 = readLine().split(" ").map{it.toInt()}
    val list2 = readLine().split(" ").map{it.toInt()}
    var result = mutableListOf<Int>()
    for(i in list1){
        result.add(i)
    }
    for(i in list2){
        result.add(i)
    }
    for(i in result.sorted()){
        bw.write("$i ")
    }


    bw.flush()
    bw.close()
    this.close()
}