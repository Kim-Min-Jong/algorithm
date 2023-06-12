import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val init = readLine()
    val n = readLine().toInt()
    val list = LinkedList<Char>()
    init.forEach {
        list.add(it)
    }

    val iter = list.listIterator();
    // iterator 커서 이동
    while(iter.hasNext()) {
			iter.next();
	}
    repeat(n) {
        val commands = readLine()
        when (commands[0]) {
            'L' -> {
				if(iter.hasPrevious())
					iter.previous();
            }
            'D' -> {
				if(iter.hasNext())
					iter.next();
            }
            'B' -> {
                if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
            }

            'P' -> {
                iter.add(commands[2])
            }
        }
    }
    bw.write(list.joinToString(""))

    bw.flush()
    bw.close()
    close()
}