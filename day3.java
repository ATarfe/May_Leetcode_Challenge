//RansomNote

//Solution 1: Using HashMap
class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() == 0) return true;
        if (magazine.length() == 0) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c: magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c: ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            
            if (count == 0) return false;
            
            map.put(c, count - 1);
        }
        
        return true;
    }
}


//Solution2: Calculating the count of letters in each of the string
class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letter = new int[26];
        
        for (char c: ransomNote.toCharArray()) {
            letter[c - 'a'] -= 1;
        }
        
        for (char c: magazine.toCharArray()) {
            letter[c - 'a'] += 1;
        }
        
        for (int i = 0; i < 26; i++) {
            if (letter[i] < 0) return false;  
        }
        
        return true;
    }
}