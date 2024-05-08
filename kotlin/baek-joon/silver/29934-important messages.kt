import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val contactList = mutableListOf<String>()
    val inputList = mutableListOf<String>()
    val n = readLine().toInt()
    var sum = 0
    repeat(n) {
        contactList.add(readLine())
    }
    val m = readLine().toInt()
    repeat(m) {
        inputList.add(readLine())
    }

    inputList.forEach { str ->
        sum += contactList.count{ it == str}
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}