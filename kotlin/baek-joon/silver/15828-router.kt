import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val size = readLine().toInt()
    val router:Queue<Int> = LinkedList<Int>()

    while(true) {
        val packet = readLine().toInt()
        when(packet) {
            -1 -> break
            0 -> {
                router.poll()
            }
            else -> {
                if(router.size < size)
                    router.offer(packet)
            }
        }
    }
    if(router.isEmpty()) {
        bw.write("empty")
    } else{
        while(router.isNotEmpty()) {
            bw.write("${router.poll()} ")
        }
    }

    bw.flush()
    bw.close()
    close()
}
