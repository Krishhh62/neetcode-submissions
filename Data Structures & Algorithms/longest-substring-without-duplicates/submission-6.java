class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxi=0;
        for(int i=0;i<n;i++){
            HashSet<Character> vis=new HashSet<>();
            for(int j=i;j<n;j++){
                if(vis.contains(s.charAt(j))){
                    break;
                }
                vis.add(s.charAt(j));
        
            }
            maxi=Math.max(maxi,vis.size());
        }
        return maxi;
    }
}
