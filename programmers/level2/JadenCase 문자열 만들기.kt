class Solution {
    fun solution(s: String): String {
        var list = s.toLowerCase().toMutableList()
        for(i in 1..list.size){
           list[0] = list[0].toUpperCase()
           if(list[i-1] == ' '){ 
               try{
                list[i] = list[i].toUpperCase()
               } catch(e: Exception){ break }
            }
        }
        return list.joinToString("")
    }
}
