class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> results = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (int a : nums1) {
            set1.add(a);
        }

        for (int a : nums2) {
            if (set1.contains(a)) {
                results.add(a);
            }
        }

        // Convert Set to int[]
        int[] ans = new int[results.size()];
        int i = 0;
        for (int val : results) {
            ans[i++] = val;
        }

        return ans;
    }
}
