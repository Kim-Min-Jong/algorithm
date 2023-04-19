import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    val (m, n) = readLine().split(" ").map{it.toInt()}

    val strList = mutableListOf<String>()

    for(i in m..n) {
        val str = i.toString().chunked(1).map{it.toInt()}
        val sb = StringBuilder()
        str.forEach {
            sb.append(list[it]+" ")
        }
        strList.add(sb.trim().toString())
    }

    strList.sorted().forEachIndexed{ idx, str ->
        val tmp = str.split(" ").map{ list.indexOf(it)}
        if(idx % 10 == 9)
            bw.write(tmp.joinToString("")+"\n")
        else bw.write(tmp.joinToString("")+" ")
    }


    bw.flush()
    bw.close()
    close()
}
