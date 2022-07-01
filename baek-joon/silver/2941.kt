import java.util.*
fun main() = with(Scanner(System.`in`)){
    var str = nextLine()
    val arr = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    for (i in arr) {
        str = str.replace(i, "a")
    }
    println(str.length)
}
