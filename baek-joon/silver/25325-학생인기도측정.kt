import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val students = readLine().split(" ")
    val map = HashMap<String, Int>()
    for(i in students.indices){
        map[students[i]] = 0
    }
    repeat(n){
        val l = readLine().split(" ")
        for(i in l){
            map[i] = map[i]?.plus(1)!!
        }
    }

    map.toList().sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first }).forEach{
        bw.write("${it.first} ${it.second}\n")
    }
    
    bw.flush()
    bw.close()
    close()
}