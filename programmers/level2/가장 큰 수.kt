class Solution {
    fun solution(numbers: IntArray): String {
            val answer = numbers.sortedWith( Comparator { a, b -> 
                (b.toString()+a.toString()).compareTo(a.toString()+b.toString())  
            })
    
            if(answer[0].toString()=="0") return "0"
            return answer.joinToString("")
        }
    
    }