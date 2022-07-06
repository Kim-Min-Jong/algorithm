import java.io.*
fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    for (i in 0 until n) {
        for (j in 1 until n - i) bw.write(" ")
        for (j in 0 until (i + 1) * 2 - 1) bw.write("*")
        bw.write("\n")
    }
    bw.flush()
    bw.close()
    this.close()
}