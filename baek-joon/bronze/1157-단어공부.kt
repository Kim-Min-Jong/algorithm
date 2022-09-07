import java.util.*
fun main() = with(Scanner(System.`in`)){
    val str = nextLine()
    val list = str.chunked(1)
    val map = list.groupBy{it.toLowerCase()}.map{it.key to it.value.size}.toMap().toList().sortedByDescending { it.second }
    if(str.length == 1){
        println(str.toUpperCase())
        return
    }
    if(map[0].second == map[1].second){
        println("?")
    }else {
        val result = map[0].first.toUpperCase()
        println(result)
    }
}
