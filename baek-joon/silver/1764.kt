import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n,m) = readLine().split(" ").map{it.toInt()}
    var total = Array<String>(n+m){" "}
    val list = mutableListOf<String>()
    var cnt = 0
    for(i in 0 until n+m){
        total[i] = readLine()
    }
    total = total.sortedArray()
    for(j in 0 until n+m-1){
        if(total[j] == total[j+1]){
            cnt++
            list.add(total[j])
        }
    }

    bw.write("$cnt\n")
    list.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
    this.close()
}