//Number Complement

//Solution 1: Naive approach
class Solution1 {
    public int findComplement(int num) {
        if (num == 0) return 1;
        if (num == 1) return 0;
        
        String str = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        
        for (char c: str.toCharArray()) {
            if (c == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        
        return Integer.parseInt(sb.toString(), 2);
    }
}