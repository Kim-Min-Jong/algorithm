import java.io.BufferedWriter
import java.io.OutputStreamWriter


val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val list = mutableListOf<String>()
    while(true){
        val str = readLine()
        if(str == null || str.isEmpty()) break
        list.add(str)
    }
    val size = list.size

    list.groupBy { it }.map{it.key to it.value.size}.sortedBy { it.first }.forEach{
        bw.write(it.first + " %.4f\n".format((it.second*100.0).toDouble() / size))
    }
    bw.flush()
    bw.close()
    close()
}