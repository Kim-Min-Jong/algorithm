import java.util.*
fun main() = with(Scanner(System.`in`)){
    var mul = 1
    while(hasNextInt()){
        var a = nextInt()
        mul *= a
    }
    val list = MutableList<Int>(10,{i->0})
    val mulList = mul.toString().chunked(1)
    for(i in mulList.indices){
        list[mulList[i].toInt()] += 1
    }
    for(i in list) println(i)
}
