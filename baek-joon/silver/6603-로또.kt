import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    while(true) {
        val list = readLine().split(" ").map{it.toInt()}
        val numList = list.slice(1 until list.size)
        if(list[0] == 0) break
        val answer = mutableListOf<List<Int>>()
        combination(answer, numList, Array(numList.size){false},0,6)
        answer.forEach { it ->
            it.forEach {
                bw.write("$it ")
            }
            bw.write("\n")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
    close()
}
fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
    if(target == 0) {
        answer.addAll( listOf(el.filterIndexed { index, t -> ck[index] }) )
    } else {
        for(i in start until el.size) {
            ck[i] = true
            combination(answer, el, ck, i + 1, target - 1)
            ck[i] = false
        }
    }
}