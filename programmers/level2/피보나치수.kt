class Solution {
    fun solution(n: Int): Int {
        var nums = Array(n+1){0}
        nums[0] = 0
        nums[1] = 1
        nums[2] = 1
        for(i in 3..n){
            nums[i] = (nums[i-1] + nums[i-2]) % 1234567
        }
        return nums.last() 
    }
}
