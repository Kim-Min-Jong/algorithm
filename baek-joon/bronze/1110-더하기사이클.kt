import java.util.*
fun main() = with(Scanner(System.`in`)){
    var n:Int = nextInt()
    var num = n
    var cnt:Int = 0
    do{
       num = num % 10 * 10 +(num / 10 + num % 10) % 10
       cnt++
    }while(num != n)
    print(cnt)
}
