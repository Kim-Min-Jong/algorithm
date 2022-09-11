import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
val list = mutableListOf<Int>()
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    _25370(0, 1, n)

    bw.write("${list.toSet().size}")

    bw.flush()
    bw.close()
    close()
}
fun _25370(cnt: Int, mul:Int, n:Int){
    if(cnt == n){
        list.add(mul)
        return
    }
    for(i in 1..9){
        _25370(cnt+1 ,mul*i , n)
    }
}