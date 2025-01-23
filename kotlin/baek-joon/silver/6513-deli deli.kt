import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val (l, n) = readLine().split(" ").map { it.toInt() }
    val map = hashMapOf<String, String>()
    repeat(l) {
        val (irregular, new) = readLine().split(" ")
        map[irregular] = new
    }

    repeat(n) {
        val word = readLine()

        if (word in map) {
            bw.write("${map[word]}\n")
        } else if(word.last() == 'y' && word.takeLast(2)[0] !in listOf('a','e','i','o','u',)) {
            bw.write("${word.substring(0,word.length - 1)}ies\n")
        } else if(word.last() in listOf('o', 's', 'x') || word.substring(word.length - 2,word.length) in listOf("ch", "sh")) {
            bw.write("${word}es\n")
        } else {
            bw.write("${word}s\n")
        }
    }

    closeBW()
    close()
}