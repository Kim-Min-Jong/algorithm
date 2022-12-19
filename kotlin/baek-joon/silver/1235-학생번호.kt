import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val set = hashSetOf<String>()
    val list = mutableListOf<String>()
    var cnt = 0
    repeat(n){
        list.add(readLine())
    }
    while(true){
        for(i in 0 until n){
            set.add(list[i].substring(list[i].length - cnt until list[i].length))
        }
        if(set.size == n){
            break
        } else{
            cnt++
            set.clear()
            continue
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
    close()
}