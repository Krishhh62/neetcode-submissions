class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        for(int i:nums){
            if(hs.contains(i) && !hs.contains(i-1)){
                int curr=i;
                int count=0;
                while(hs.contains(curr)){
                    curr++;
                    count++;
                }
                res=Math.max(res,count);
            }
        }
        return res;
    }
}
