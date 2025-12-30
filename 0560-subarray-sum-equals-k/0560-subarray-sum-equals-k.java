class Solution {
    public int subarraySum(int[] nums, int k) {
        int subarrays = 0;
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            if(nums[i] == k){
                subarrays++; 
            }
            sum = sum + nums[i]; 
           for (int j = i+1; j< nums.length; j++){
                sum = sum + nums[j]; 
                if (sum == k)
                {
                    subarrays++;
                }
           }
          
        }

        return subarrays;
    }
}