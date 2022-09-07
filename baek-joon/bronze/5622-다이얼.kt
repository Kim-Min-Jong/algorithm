import java.util.*
fun main() = with(Scanner(System.`in`)){
    val str = nextLine().chunked(1)
    val map = mapOf<String,Int>(Pair("A",2),Pair("B",2),Pair("C",2),Pair("D",3),Pair("E",3),Pair("F",3),Pair("G",4),Pair("H",4),Pair("I",4),
        Pair("J",5),Pair("K",5),Pair("L",5),Pair("M",6),Pair("N",6),Pair("O",6),Pair("P",7),Pair("Q",7),Pair("R",7),Pair("S",7),Pair("T",8),
        Pair("U",8),Pair("V",8),Pair("W",9),Pair("X",9),Pair("Y",9),Pair("Z",9))
    var res = mapOf<String,Int>()
    var sum = 0
    for(i in str){
        res = map.filter{it.key == i}
        sum += res.map{it.value}[0]
    }
    println(sum+str.size)
}
