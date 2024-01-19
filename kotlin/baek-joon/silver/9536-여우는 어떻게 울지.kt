import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val bark = readLine().split(" ").toMutableList()
        val animalBarkList = mutableListOf<String>()
        while(true) {
            val anotherBark = readLine()
            if(anotherBark == "what does the fox say?") break
            animalBarkList.add(anotherBark.split(" ")[2])
        }

        bark.removeAll(animalBarkList)

        bw.write("${bark.joinToString(" ")}\n")
    }

    bw.flush()
    bw.close()
    close()
}