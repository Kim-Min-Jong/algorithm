import java.util.*
fun main() = with(Scanner(System.`in`)){
    val a = nextLine().split(" ")
    val list1 = a[0].chunked(1).reversed().joinToString("").toInt()
    val list2 = a[1].chunked(1).reversed().joinToString("").toInt()
    if(list1>list2)
        println(list1)
    else println(list2)
}
