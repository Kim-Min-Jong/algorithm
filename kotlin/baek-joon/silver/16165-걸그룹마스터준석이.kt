import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    //16165
    val (n, m) = readLine().split(" ").map{it.toInt()}
    val girlGroup = HashMap<String,MutableList<String>>()
    repeat(n){
        val group = readLine().toString()
        val num = readLine().toInt()
        val list = mutableListOf<String>()
        repeat(num){
            list.add(readLine().toString())
        }
        girlGroup[group] = list
    }
    repeat(m){
        val name = readLine().toString()
        val m = readLine().toInt()
        if(m == 1){
            for(each in girlGroup.values){
                if(name in each){
                    bw.write("${girlGroup.filterValues { name in it }.keys.joinToString()}\n")
                }
            }
        } else{
            girlGroup[name]?.sorted()?.forEach {
                bw.write("$it\n")
            }
        }
    }
    bw.flush()
    bw.close()
    close()
}