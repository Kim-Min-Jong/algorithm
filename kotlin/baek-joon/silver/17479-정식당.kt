import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
      val (a, b, c) = readLine().split(" ").map { it.toInt() }
    val normalMenu = HashMap<String, Long>()
    val specialMenu = HashMap<String, Long>()
    val serviceMenu = HashSet<String>()
    var normalPrices = 0L
    var specialPrice = 0L
    var serviceCount = 0

    repeat(a) {
        val (menu, price) = readLine().split(" ")
        normalMenu[menu] = price.toLong()
    }
    repeat(b) {
        val (menu, price) = readLine().split(" ")
        specialMenu[menu] = price.toLong()
    }
    repeat(c) {
        serviceMenu.add(readLine())
    }

    val n = readLine().toInt()

    repeat(n) {
        val menu = readLine()
        when (menu) {
            in normalMenu -> normalPrices += normalMenu[menu]!!
            in specialMenu -> specialPrice += specialMenu[menu]!!
            in serviceMenu -> serviceCount += 1
        }
    }

    when (serviceCount) {
        // 서비스 있
        1 -> {
            when {
                normalPrices + specialPrice >= 50000 -> {
                    if (specialPrice > 0) {
                        when {
                            normalPrices >= 20000 -> {
                                bw.write("Okay")
                            }

                            else -> bw.write("No")

                        }

                    } else bw.write("Okay")
                }
                else -> bw.write("No")
            }
        }
        // 서비스 없
        else -> {
            when {
                serviceCount > 1 -> bw.write("No")
                // 스페셜 없
                specialPrice > 0 -> {
                    when {
                        normalPrices >= 20000 -> bw.write("Okay")
                        else -> bw.write("No")
                    }
                }

                else -> bw.write("Okay")
            }
        }
    }


    bw.flush()
    bw.close()
    close()
}