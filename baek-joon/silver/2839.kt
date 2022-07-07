import java.util.*
fun main() = with(Scanner(System.`in`)){
        var n = nextInt()
        var cnt = 0
        while(true){
                if(n % 5 == 0){
                        println(cnt + (n / 5))
                        return
                }
                if(n<=0){
                        println(-1)
                        return
                }
                n-=3
                cnt++
        }
}