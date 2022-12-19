class Solution {
    var answer: String = ""
    fun solution(new_id: String): String {
        answer = rule1(new_id)
        answer = rule2(answer)
        answer = rule3(answer)
        answer = rule4(answer)
        answer = rule5(answer)
        answer = rule6(answer)
        answer = rule7(answer)
        return answer
    }
    fun rule1(id:String):String{
        repeat(id.length){answer+=id[it].toLowerCase()}
        return answer
    }
    fun rule2(id:String):String{
        return id.filter{(it >= 'a' && it <='z') || it == '-' || it == '_' || it == '.' || it.isDigit() }
    }
    fun rule3(id:String):String{
        return id.replace("[.]*[.]".toRegex(), ".")
    }
    fun rule4(id:String):String{
        return id.removePrefix(".").removeSuffix(".")
    }
    fun rule5(id:String):String{
        return if(id.isEmpty()) "a" else id
    }
    fun rule6(id:String):String{
        if(id.length >= 16){
            return id.substring(0 until 15).removeSuffix(".")
        }
        return id
    }
    fun rule7(id:String):String{
        var newId = id
        if(newId.length <= 2){
            while(newId.length != 3){
                newId += newId[id.length-1]
            }
            return newId
        }
        return newId
    }
}