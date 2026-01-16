class Solution {
    public int totalFruit(int[] fruits) {
            Map<Integer, Integer> map = new HashMap();
            int max = 0;
            int left = 0;
            for(int i =0; i< fruits.length; i++){
                map.put(fruits[i], map.getOrDefault(fruits[i], 0)+1);
                while(map.size()>2){ 
                    map.put(fruits[left], map.get(fruits[left])-1);
                    if(map.get(fruits[left]) == 0)
                    {
                        map.remove(fruits[left]);
                    }
                    left++;
                }
                max = Math.max(max, i-left+1);
            }
            return max;
        }
         
}

//  int currentCount = 0;
//         int maxCount = 0;
//         Set<Integer> set1 = new HashSet();
//         Set<Integer> set2 = new HashSet();
//         for(int i = 0; i<fruits.length; i++){
//                 if(set1.isEmpty() || set1.contains(fruits[i])){
//                     set1.add(fruits[i]);
//                     currentCount++;
//                 }else if(set2.isEmpty() || set2.contains(fruits[i])){
//                     set2.add(fruits[i]);
//                     currentCount++;
//                 }
//                 else 
//                 {
//                     if(currentCount> maxCount){
//                      maxCount = currentCount;
//                     }
//                     i = i-currentCount;
//                     currentCount =0;
//                     set1.clear();
//                     set2.clear();
//                 }
//             }

//             if(currentCount>maxCount)
//                 return currentCount;
//             else
//                 return maxCount;
            
// int temp = 1;
            // bucket1.add(fruits[i]);
            // for (int j=i+1; j<fruits.length; j++){
            //     if(bucket1.contains(fruits[j]) || bucket2.contains(fruits[j]))
            //         temp++;
            //     else if(bucket2.isEmpty()){
            //         bucket2.add(fruits[j]);
            //         temp++;
            //     }
            //     else{
            //         break;
            //     }
            //}
            //bucket1.clear();
            // bucket2.clear();
            // if(temp> count)
            //     count = temp;
            