import java.util.*
fun main() = with(Scanner(System.`in`)){
    val list = ArrayList<Int>()
    val n = nextInt()
    for(i in 1..n){
        list.add(nextInt())
    }
    print("${list.minOrNull()!!} ${list.maxOrNull()!!}")
}
