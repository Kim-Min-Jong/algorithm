import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    var h = sc.nextInt()
    var m = sc.nextInt()
    var plus = sc.nextInt()
    
    if (m + plus >= 60) {
        val plusHour = (m + plus) / 60
        m = (m + plus) % 60
        if (h + plusHour >= 24) {
            h = (h + plusHour) % 24
        } else {
            h += plusHour
        }
    } else {
        m += plus
    }
    print("${h} ${m}")
}