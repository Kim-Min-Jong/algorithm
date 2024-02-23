import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine().split(" ").map { it.toInt() }
    val outputList1 = mutableListOf<Pair<Int, Int>>()
    val outputList2 = mutableListOf<Pair<Int, Int>>()

    for(i in -999..999) {
        for(j in -999..999) {
            if(input[0] * i + input[1] * j == input[2]) {
                outputList1.add(i to j)
            }
            if(input[3] * i + input[4] * j == input[5]) {
                outputList2.add(i to j)
            }
        }
    }
    val res = outputList1.intersect(outputList2.toSet()).first()
    bw.write("${res.first} ${res.second}")

    bw.flush()
    bw.close()
    close()
}