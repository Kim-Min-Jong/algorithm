import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = mutableListOf<ChockSukRu>()
    repeat(n) {
        val (quality, price) = readLine().split(" ").map { it.toInt() }
        list.add(ChockSukRu(quality, price))
    }
    val type1 = list.sortedWith(compareByDescending<ChockSukRu> { it.quality }.thenBy { it.price })
    val type2 = list.sortedWith(compareBy<ChockSukRu> { it.price }.thenByDescending { it.quality })

    bw.write("${type1[0].quality} ${type1[0].price} ${type1[1].quality} ${type1[1].price}\n" )
    bw.write("${type2[0].quality} ${type2[0].price} ${type2[1].quality} ${type2[1].price}" )
    
    bw.flush()
    bw.close()
    close()
}
data class ChockSukRu(val quality: Int, val price: Int)