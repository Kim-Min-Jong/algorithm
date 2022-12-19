import java.util.*
fun main() = with(Scanner(System.`in`)){
    val set = mutableSetOf<Int>()
    while(hasNextInt()){
        var a = nextInt()
        set.add(a% 42)
    }
    print(set.size)
}
