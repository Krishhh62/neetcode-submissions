class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String curr=strs[i];
            char[] sortstr=curr.toCharArray();
            Arrays.sort(sortstr);
            String newstr=new String(sortstr);
            hm.putIfAbsent(newstr,new ArrayList<>());
            if(hm.containsKey(newstr)){
                hm.get(newstr).add(strs[i]);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
