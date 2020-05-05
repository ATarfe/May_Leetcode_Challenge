//First Unique character in a string
//Solution1: Using a HashMap O(n)

class Solution1 {
    public int firstUniqChar(String s) {
        if (s.length() == 0) return -1;
        
        Map<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        int n = str.length;
        for (int i = 0; i < n; i++){
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }
        
        for (int i = 0; i < n; i++) {
            if (map.get(str[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}