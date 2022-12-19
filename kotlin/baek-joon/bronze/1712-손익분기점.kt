import java.util.*
fun main() = with(Scanner(System.`in`)){
        val default = nextLong()
        val makePrice = nextLong()
        val sellPrice = nextLong()
        var sumMake = default
        var sumSell = 0L
        var cnt = 1L
        if (sellPrice - makePrice > 0) {
            cnt = default / (sellPrice - makePrice) + 1
        } else {
            cnt = -1
        }

        println(cnt)
    }


