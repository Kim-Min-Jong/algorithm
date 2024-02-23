class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        for(i in 0 until commands.size){
            var arr = commands[i]
            var tmpArr = array.sliceArray(arr[0]-1..arr[1]-1).sortedArray()
            answer = answer.plus(tmpArr[arr[2]-1])
        }
        return answer
    }
}