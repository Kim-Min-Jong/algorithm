import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val deque: Deque<Int> = LinkedList<Int>()
    repeat(n){
        val m = readLine().split(" ")
        when(m[0]){
            "push_front" ->{
                deque.addFirst(m[1].toInt())
            }
            "push_back" ->{
                deque.addLast(m[1].toInt())
            }
            "pop_front"->{
                if(deque.isNotEmpty()){
                    bw.write("${deque.removeFirst()}\n")
                }else{
                    bw.write("-1\n")
                }
            }
            "pop_back"->{
                if(deque.isNotEmpty()){
                    bw.write("${deque.removeLast()}\n")
                }else{
                    bw.write("-1\n")
                }
            }
            "size"->{
                bw.write("${deque.size}\n")
            }
            "empty"->{
                if(deque.isEmpty()) bw.write("1\n")
                else bw.write("0\n")
            }
            "front"->{
                if(deque.isNotEmpty())
                    bw.write("${deque.peekFirst()}\n")
                else bw.write("-1\n")
            }
            "back"->{
                if(deque.isNotEmpty())
                    bw.write("${deque.peekLast()}\n")
                else bw.write("-1\n")
            }

        }
    }


    bw.flush()
    bw.close()
    this.close()
}