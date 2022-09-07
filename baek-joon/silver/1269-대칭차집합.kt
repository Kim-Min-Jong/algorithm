import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (n,m) = readLine().split(" ").map{it.toInt()}
    val nSet = readLine().split(" ").map{it.toInt()}.toSet()
    val mSet = readLine().split(" ").map{it.toInt()}.toSet()

    val nm = nSet.subtract(mSet)
    val mn = mSet.subtract(nSet)
    bw.write("${nm.size+mn.size}")
    bw.flush()
    bw.close()
    this.close()
}