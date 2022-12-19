import java.util.*
fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    var sum = 0
    for(i in 1..n){
        sum+= i
    }
    print(sum)
}