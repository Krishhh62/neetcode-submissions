class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        String str=sb.toString();
        if(s.equals(str)){
            return true;
        }
        return false;
    }
}
