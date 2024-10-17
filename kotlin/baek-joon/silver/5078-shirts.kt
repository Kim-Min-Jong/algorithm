import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
data class Clothes(val size: Int, val name: String)
fun main() = with(System.`in`.bufferedReader()) {
       val list = mutableListOf<Clothes>()
    val n = readLine().toInt()
    fun makeClothes(str: String): Clothes {
        return when(str[0]) {
            'S' -> Clothes(1, str)
            'M' -> Clothes(2, str)
            'L' -> Clothes(3, str)
            else -> Clothes(-1, str)
        }
    }
    repeat(n) {
        val str = readLine()
        list.add(makeClothes(str))
    }
    val m = readLine().toInt()
    repeat(m) {
        val str = readLine()
        list.add(makeClothes(str))
    }
    val last = readLine().toInt()

    list.sortedWith(compareBy<Clothes> { it.size }.thenBy { it.name[1] })
        .forEach {
            bw.write("${it.name} ")
        }

    bw.flush()
    bw.close()
    close()
}