import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<String>()
    val wordList = mutableListOf<String>()
    repeat(n) {
        list.add(readLine())
    }
    val m = readLine().toInt()
    repeat(m) {
        wordList.add(readLine())
    }

    val index = list.indexOf("?")
    val prevIndex = index - 1
    val nextIndex = index + 1

    if (list.size == 1) {
        bw.write("${wordList.first()}")
    } else {
        when(index) {
            // ?가 맨 앞일 때
            0 -> {
                val nextWord = list[1]
                val word = wordList.find { it.endsWith(nextWord.first()) && list.contains(it).not() }
                bw.write("$word")
            }
            // ?가 맨 뒤일 때
            list.size - 1 -> {
                val prevWord = list[list.size - 2]
                val word = wordList.find { it.startsWith(prevWord.last()) && list.contains(it).not() }
                bw.write("$word")
            }
            // ?가 중간일 때
            else -> {
                val prevWord = list[prevIndex]
                val nextWord = list[nextIndex]
                val word = wordList.find { it.startsWith(prevWord.last()) && it.endsWith(nextWord.first()) && list.contains(it).not() }
                bw.write("$word")
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}