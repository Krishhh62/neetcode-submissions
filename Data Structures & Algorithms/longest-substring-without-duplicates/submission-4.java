class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int n=s.length();
        int l=0,r=0;
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        boolean[] vis=new boolean[128];
        while(r<n){
            while(vis[s.charAt(r)]==true){
                vis[s.charAt(l)]=false;
                l++;
            }
            vis[s.charAt(r)]=true;
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}
