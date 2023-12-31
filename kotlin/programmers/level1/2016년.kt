import java.util.*
import java.text.*
class Solution {
    fun solution(a: Int, b: Int): String {
    val calendar = Calendar.getInstance()  
    calendar.set(2016, a-1, b)  
    return SimpleDateFormat("EEE", Locale.ENGLISH).format(calendar.timeInMillis).toUpperCase()  

    }
}