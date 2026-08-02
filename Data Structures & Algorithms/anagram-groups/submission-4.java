class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            int[] freq=new int[26];
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;
            }
            String freqStr=Arrays.toString(freq);
            hm.putIfAbsent(freqStr,new ArrayList<>());
            hm.get(freqStr).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
