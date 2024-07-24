import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

data class Coffee(val name: String, val small: Int, val medium: Int, val large: Int)
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val (coffee, person) = readLine().split(" ").map { it.toInt() }
        val coffeeList = mutableListOf<Coffee>()
        repeat(coffee) {
            val (kind, small, medium, large) = readLine().split(" ")
            coffeeList.add(Coffee(kind, small.toInt(), medium.toInt(), large.toInt()))
        }

        repeat(person) {
            val (name, size, kind) = readLine().split(" ")
            val deliveryFee = 100 / person

            val totalFee = when(size) {
                "small" -> {
                    coffeeList.find { it.name == kind }!!.small
                }
                "medium" -> {
                    coffeeList.find { it.name == kind }!!.medium
                }
                "large" -> {
                    coffeeList.find { it.name == kind }!!.large
                }

                else -> 0
            } + deliveryFee

            val roundedFee = when(totalFee % 10) {
                1 -> totalFee - 1
                6 -> totalFee - 1
                4 -> totalFee + 1
                9 -> totalFee + 1
                else -> totalFee
            }

            bw.write("$name $roundedFee\n")
        }
    }
    
    bw.flush()
    bw.close()
    close()
}