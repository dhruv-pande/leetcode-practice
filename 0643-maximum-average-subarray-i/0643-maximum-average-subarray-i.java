class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxSum = 0;
       for (int i = 0; i< k; i++){
            maxSum += nums[i];
       }
       sum = maxSum;
       for (int i = k; i< nums.length ; i ++){
         sum = (sum + nums[i]) - nums[i-k];
         if (sum > maxSum)
            maxSum = sum;
       }
        return maxSum / k;
    }
}