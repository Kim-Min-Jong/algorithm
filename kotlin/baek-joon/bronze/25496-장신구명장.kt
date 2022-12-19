import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(" ").map { it.toInt() }.sorted()
    var cnt = 0
    var tmp = n
    for(i in list.indices){
        tmp += list[i]
        if(tmp < 200)
            cnt++
        else break
    }
    if(n >= 200) bw.write("0")
    else if(tmp >= 200) bw.write("${cnt+1}")
    else bw.write("${cnt}")

    bw.flush()
    bw.close()
    close()
}