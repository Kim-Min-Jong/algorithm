import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()
    val d = readLine().toInt()
    val e = readLine().toInt()

    val list = arrayOf(a+d,a+e, b+d, b+e, c+d, c+e)
    bw.write("${list.minOrNull()!!-50}")
    bw.flush()
    bw.close()
    this.close()
}
