class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> test = new HashSet();
        boolean isPanagram = false;

        for(Character c : sentence.toCharArray()){
            test.add(c);
        }

        if(test.size()==26)
            isPanagram = true;

    return isPanagram;
    }
}