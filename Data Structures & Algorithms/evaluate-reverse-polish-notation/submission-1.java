class Solution {
    public int evalRPN(String[] tokens) {
       // you think what to add in stack here ?
       //it is basically the number ot be added and when u see any operator then 
       //remove those numbers and perform the operation at which we are at that 
       //point 
       //TC:0(N)
       //SC:O(N)
       Stack<Integer> st=new Stack<Integer>();
       for(String s:tokens){
        if(s.equals("+")){
            st.push(st.pop()+st.pop());
        }else if(s.equals("-")){
            int a=st.pop();
            int b=st.pop();
            st.push(b-a);
        }else if(s.equals("*")){
            st.push(st.pop()*st.pop());
        }else if(s.equals("/")){
            int a=st.pop();
            int b=st.pop();
            st.push(b/a);
        }else{
            st.push(Integer.parseInt(s));
        }
       }
       return st.pop();
    }
}
