//Jewels and Stones

class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J.length() == 0) return 0
        Set<Character> jewels = new HashSet<>();
        int count = 0;
        
        for (char c: J.toCharArray()) {
                jewels.add(c);
        }
        
        for (char s: S.toCharArray()) {
            if (jewels.contains(s)) {
                count++;
            }
        }
        
        return count;
    }
}