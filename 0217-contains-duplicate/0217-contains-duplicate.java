class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map elements = new HashMap<Integer, Integer> ();
        for (int i : nums)
         {
            if(elements.containsKey(i)){
                return true;
            }
            elements.put(i, i);
        }
        return false;
    }
}