class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxSubstring = 0;
        // Set <Character> set = new HashSet();
        // for (int i=0; i<s.toCharArray().length; i++){
        //     int substringCount=1;
        //     set.add(s.charAt(i));
        //     for (int j=i+1; j<s.toCharArray().length; j++){
        //         if(set.contains(s.charAt(j))){
        //             set.clear();
        //             break;
        //         }
                    
        //         else {
        //             set.add(s.charAt(j));
        //             substringCount++;
        //         }
        //     }

        //     if (substringCount > maxSubstring)
        //         maxSubstring = substringCount;
        // }

        //  return maxSubstring;

        Set<Character> set = new HashSet(); //abcabcbb    a
        int maxSubstring = 0;
        int leftIndex = 0;
        for (int i=0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(leftIndex));
                leftIndex++;
            }
            set.add(s.charAt(i));
            if(set.size() > maxSubstring){
                maxSubstring = set.size();
            }
        }
        return maxSubstring;
    }
   
}