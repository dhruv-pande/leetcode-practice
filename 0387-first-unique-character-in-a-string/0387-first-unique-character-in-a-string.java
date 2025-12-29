class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int index=0;
        for (char a : s.toCharArray()){
            if(map.containsKey(a)){
                map.put(a, map.get(a) + 1);
            }
           else 
               map.put(a, 1);
        }
        
         for (char a : s.toCharArray()){
            if(map.get(a).equals(1)){
                return index;
            }
            else{
                index++;
            }
         }

        return -1;
    }
}