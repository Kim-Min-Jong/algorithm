import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val (n,m) = readLine().split(" ").map{it.toInt()}
    val queue:Queue<Int> = LinkedList<Int>()
    val list = mutableListOf<Int>()
    for(i in 1..n){
        queue.add(i)
    }
    while(queue.isNotEmpty()){
        for(i in 0 until m-1){
            queue.add(queue.poll())
        }
        list.add(queue.poll()!!)
    }

    bw.write(list.toString().replace('[','<').replace(']','>'))
    
    bw.flush()
    bw.close()
    this.close()
}