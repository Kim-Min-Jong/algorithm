import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var h = sc.nextInt()
    var m = sc.nextInt()
 
    if(m < 45){
        if(h == 0){
            h = 23
            m += 60
        }
        else{
            h -= 1
            m += 60
        }
    }
    println(h)
    println(m-45)
}