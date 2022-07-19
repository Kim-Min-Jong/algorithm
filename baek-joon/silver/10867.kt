import java.io.*
fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var list = readLine().split(" ").map{it.toInt()}

    list = list.distinct().sorted()
    for(i in list)
        bw.write("$i ")

    bw.flush()
    bw.close()
    this.close()
}