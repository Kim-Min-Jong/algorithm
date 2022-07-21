import java.util.*
import java.io.*
import kotlin.math.round

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = List(n){i->i+1}

    val list2 = permutation(list)
    list2.forEach { it ->
        it.forEach { 
            bw.write("$it ")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    this.close()
}
fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el ): List<List<T>> {
    return if(sub.isEmpty()) listOf(fin)
    else sub.flatMap { permutation(el, fin + it, sub - it) }
}