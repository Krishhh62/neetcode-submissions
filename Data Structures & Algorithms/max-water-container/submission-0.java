class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxVol=Integer.MIN_VALUE;
        while(l<r){
            int mini=Math.min(heights[l],heights[r]);
            maxVol=Math.max(maxVol,(mini*(r-l)));
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxVol;
    }
}
