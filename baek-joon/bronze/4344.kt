import java.util.*
fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    repeat(n){
        var sum = 0
        var avg = 0.0
        var cnt = 0
        val a = nextInt()
        var list = IntArray(a)
        for(i in 1..a){
            var score = nextInt()
            list[i-1] = score
            sum += score
        }
        for(i in list){
            if(i > sum/a) cnt++
        }
        println(String.format("%.3f%%", 100.000*cnt / a))
    }
}
