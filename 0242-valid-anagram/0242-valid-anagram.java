class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
      Map <Character, Integer> m1= new HashMap<>();
      for (int i = 0; i<=s.length()- 1; i++){
        if(m1.containsKey(s.charAt(i))){
            m1.put(s.charAt(i), m1.get(s.charAt(i)) + 1);
        }
        else{
            m1.put(s.charAt(i), 1);
        }

      } 

        for(char a : t.toCharArray()){
            if(m1.containsKey(a)){
                m1.put(a, m1.get(a) - 1);
                if(m1.get(a).equals(0)){
                    m1.remove(a);
                }
            }
            else{
                return false;
            }
        }


        return true;
    }
}