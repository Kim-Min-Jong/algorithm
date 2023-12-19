import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.LinkedList

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    repeat(n) {
        val str = readLine().toMutableList()
        val list = LinkedList<Char>()
        // 현재위치 커서를 대체할 iterator
        val cursor = list.listIterator()
        for (i in 0 until str.size) {
            when(str[i]) {
                '<' -> {
                    if(cursor.hasPrevious().not()) {
                        continue
                    }
                    cursor.previous()
                }
                '>' -> {
                    if(cursor.hasNext().not()) {
                        continue
                    }
                    cursor.next()
                }
                '-' -> {
                    if(cursor.hasPrevious().not()) {
                        continue
                    }
                    cursor.previous()
                    cursor.remove()
                }
                else -> {
                    cursor.add(str[i])
                }
            }
        }
        list.forEach {
            bw.write("$it")
        }
        bw.write("\n")
    }


    bw.flush()
    bw.close()
    close()
}