class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<int[]> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> h:hm.entrySet()){
            list.add(new int[]{h.getValue(),h.getKey()});
        }
        list.sort((a,b)->b[0]-a[0]);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i)[1];
        }
        return res;
    }
}
