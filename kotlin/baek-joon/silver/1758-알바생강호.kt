import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<Int>()
    repeat(n){
        list.add(readLine().toInt())
    }
    list.sortDescending()

    var tip = 0L
    for(i in 0 until n) {
        if(list[i] - i <= 0)
            break
        tip += (list[i] - i).toLong()
    }

    bw.write("$tip")

    bw.flush()
    bw.close()
    close()
}