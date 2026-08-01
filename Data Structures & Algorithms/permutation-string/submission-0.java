class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        char[] sorts1=s1.toCharArray();
        Arrays.sort(sorts1);
        String sorteds1=new String(sorts1);
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                String substr=s2.substring(i,j+1);
                char[] substrarr=substr.toCharArray();
                Arrays.sort(substrarr);
                String sortstr2=new String(substrarr);
                if(sorteds1.equals(sortstr2)){
                    return true;
                }
            }
        }
        return false;
    }
}
