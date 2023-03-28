import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val k = readLine().toInt()
    val list = mutableListOf<String>()
    val resSet= mutableSetOf<String>()
    repeat(n) {
        list.add(readLine())
    }
    val answer = mutableListOf<List<String>>()
    combination(answer, list, Array<Boolean>(list.size){false}, 0, k)
    answer.forEach {
        val permutation = permutation(it)
        permutation.forEach { per ->
            resSet.add(per.joinToString(""))
        }
    }
    bw.write("${resSet.size}")

    bw.flush()
    bw.close()
    close()
}
fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
    if (target == 0) {
        answer.addAll(listOf(el.filterIndexed { index, t -> ck[index] }))
    } else {
        for (i in start until el.size) {
            ck[i] = true
            combination(answer, el, ck, i + 1, target - 1)
            ck[i] = false
        }
    }
}
fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el): List<List<T>> {
    return if (sub.isEmpty()) listOf(fin)
    else sub.flatMap { permutation(el, fin + it, sub - it) }
}