class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int n=s.length();
        boolean[] vis=new boolean[128];
        int maxi=0;
        if(n==0 || n==1){
            return n;
        }
        while(r<n){
            while(vis[s.charAt(r)]==true){
                vis[s.charAt(l)]=false;
                l++;
            }
            vis[s.charAt(r)]=true;
            maxi=Math.max(maxi,r-l+1);
            r++;
        }
        return maxi;
    }
}
