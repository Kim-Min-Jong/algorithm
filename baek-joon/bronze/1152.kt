import java.util.*
fun main() = with(Scanner(System.`in`)){
    var str = nextLine()
    var list = str.removePrefix(" ").removeSuffix(" ").split(" ")
    if(str == " ")
        println(0)
    else println(list.size)
}
