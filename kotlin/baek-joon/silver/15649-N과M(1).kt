import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
val list = mutableListOf<Int>()
fun main() = with(System.`in`.bufferedReader()){
    val (n, m) = readLine().split(" ").map{it.toInt()}
    backtrack_15649(n, m)
    
    bw.flush()
    bw.close()
    close()
}
fun backtrack_15649(num: Int, length: Int) {
    if(list.size == length) {
        bw.write(list.joinToString(" ")+ "\n")
        return
    }
    for (i in 1..num) {
        if((i in list).not()) {
            list.add(i)
            backtrack_15649(num, length)
            list.removeLast()
        }
    }
}