import java.util.*
fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    var sum = 0
    for(i in 1..n){
        if(x(i)) sum++     
    }
    print(sum)
}

fun x(n:Int):Boolean{
    if(n<10) return true
    else{
        var str = n.toString().chunked(1)
        for(i in 1.. str.size-2){
            if(str[i].toInt()-str[i-1].toInt() == str[i+1].toInt()-str[i].toInt())
                continue
            else return false
        }
        return true
    }
}