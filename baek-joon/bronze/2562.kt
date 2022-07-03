import java.util.*
fun main() = with(Scanner(System.`in`)){
    val list = ArrayList<Int>()
    while(hasNextInt()){
        var a = nextInt()
        list.add(a)
    }
    val max = list.maxOrNull()!!
    val idx = list.indexOf(max)+1
    print("${max} ${idx}")
}
