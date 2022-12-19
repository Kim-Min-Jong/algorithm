import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val n = readLine().toInt()
    val scoreList = mutableListOf<Score>()
    repeat(n){
        val people = readLine().split(" ")
        scoreList.add(Score(people[0],people[1].toInt(),people[2].toInt(),people[3].toInt()))
    }
    val sortedList = scoreList.sortedWith(Comparator{ a, b ->
        if(a.korean == b.korean){
            if(a.english == b.english){
                if(a.math == b.math){
                    a.name.compareTo(b.name)
                }else{
                    b.math.compareTo(a.math)
                }
            } else{
                a.english.compareTo(b.english)
            }
        } else{
            b.korean.compareTo(a.korean)
        }
    })

    sortedList.forEach {
        bw.write("${it.name}\n")
    }

    bw.flush()
    bw.close()
    close()
}
data class Score(
    val name: String,
    val korean: Int,
    val english: Int,
    val math: Int
)