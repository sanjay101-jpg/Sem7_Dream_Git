class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char a : s1)
            sb1.append(a);
        for (char b : t1)
            sb2.append(b);
        return sb1.toString().equals(sb2.toString());
        // if(sb1.toString().equals(sb2.toString()))
        // return true;
        // else
        // return false;
    }
}