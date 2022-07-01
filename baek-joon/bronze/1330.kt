import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    if(a>b){
        print(">")
    }else if(a<b){
        print("<")
    }else{
        print("==")
    }
    
}