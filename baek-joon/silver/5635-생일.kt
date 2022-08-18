import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
data class People(
    val name: String,
    val day: Int,
    val month: Int,
    val year: Int
)
fun main() = with(System.`in`.bufferedReader()){

    val n = readLine().toInt()
    val peopleList = mutableListOf<People>()
    repeat(n){
        val people = readLine().split(" ")
        peopleList.add(People(people[0],people[1].toInt(),people[2].toInt(),people[3].toInt()))
    }
    val sortedList = peopleList.sortedWith(compareBy({it.year},{it.month},{it.day}))

    bw.write(sortedList.last().name+"\n")
    bw.write(sortedList.first().name)

    bw.flush()
    bw.close()
    close()
}