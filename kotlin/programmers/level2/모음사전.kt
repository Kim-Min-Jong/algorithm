class Solution {
    private val list = mutableListOf<String>()
    private val alphabet = listOf("A", "E", "I", "O", "U")
    fun solution(word: String): Int {
        var answer = 0
        
        dfs("", 0)
        
        list.forEachIndexed { index, str ->
            if (str == word) {
                answer = index 
                return@forEachIndexed
            }
        }
        
        return answer
    }
    
    fun dfs(str: String, length: Int) {
        list.add(str)
        if(length == 5) return
        for(i in 0 until 5) {
            dfs(str + alphabet[i], length + 1)
        }
    }
}