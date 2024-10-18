import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

data class Midterm(val num: Int, val total: Int)
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val problemScoreList = readLine().split(" ").map { it.toInt() }
    val studentList = mutableListOf<Midterm>()
    repeat(m) {
        val numAndProblems = readLine().split(" ")
        val num = numAndProblems.first()
        val problems = numAndProblems.subList(1, numAndProblems.size)
        var score = 0

        problems.forEachIndexed { index, isCorrect ->
            if (isCorrect == "O") {
                score += problemScoreList[index]
            }
        }

        studentList.add(Midterm(num.toInt(), score))
    }

    val first = studentList.sortedWith(compareByDescending<Midterm> { it.total }.thenBy { it.num }).first()

    bw.write("${first.num} ${first.total}")

    bw.flush()
    bw.close()
    close()
}