import java.util.*
fun main() = with(Scanner(System.`in`)){
    var input = Triple(nextInt(),nextInt(),nextInt())
    var list = input.toList()
    var max = list.maxOrNull()!! 
    if(list[0] == list[1] && list[1] == list[2] && list[0] == list[2]){
        print(list[0]*1000+10000)
    }else if(list[0] == list[1] && list[1] != list[2] && list[0] != list[2]){
        print(1000+list[0]*100)
    }else if(list[0] == list[2] && list[1] != list[2] && list[0] != list[1]){
        print(1000+list[0]*100)
    }else if(list[1] == list[2] && list[0] != list[2] && list[0] != list[1]){
        print(1000+list[1]*100)
    }else{
        print(max*100)
    }  
}