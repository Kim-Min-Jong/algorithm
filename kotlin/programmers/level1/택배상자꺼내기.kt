class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        var answer: Int = 0
        var boxNum = 1
        val list = mutableListOf<List<Int>>()
        val height = n / w + 1
    
        for(i in 0 until height) {
            val tmp = mutableListOf<Int>()
            for(j in 0 until w) {
                if (boxNum <= n) {
                    tmp.add(boxNum)
                    boxNum++
                } else {
                    tmp.add(0)
                }          
            }
            
            if (i % 2 == 1) {
                list.add(tmp.reversed())
            } else {
                list.add(tmp)
            }
        }

        var x = 0
        var y = 0
        
        for (i in 0 until height) {
            for (j in 0 until w) {
                if (list[i][j] == num) {
                    x = i
                    y = j
                }
            }
        }

        for (i in x until height) {
            if (list[i][y] != 0) {
                answer++
            }
        }
        
        return answer 
    }
}

