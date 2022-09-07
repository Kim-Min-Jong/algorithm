import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine()
    val nSet = mutableSetOf<String>()
    for(i in 0..n.length){
        for(j in 0..n.length)
        nSet.add(n.slice(i until j))
    }
    bw.write("${nSet.size-1}")
    bw.flush()
    bw.close()
    this.close()
}