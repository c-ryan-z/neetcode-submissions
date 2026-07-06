class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alps = new int[26];
        for (char x : s.toCharArray()) {
            alps[x - 97] += 1;
        }
        
        for (char x : t.toCharArray()) {
            alps[x - 97] -= 1;
        }
        
        for(int i : alps) {
            if(i != 0) return false;
        }
        
        return true;
    }
}
