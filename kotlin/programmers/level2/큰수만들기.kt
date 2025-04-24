class Solution {
    fun solution(number: String, k: Int): String {
        var idx = 0
		val sb = StringBuilder()
    
        for(i in 0 until number.length - k) {
			var max ='0' 
            for(j in idx..i + k){
				if(max < number[j]) {
					max = number[j]
					idx = j + 1
				}
			}
			sb.append(max)
		}
        
        return sb.toString()
    }
}