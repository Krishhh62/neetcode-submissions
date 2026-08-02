class MinStack {

    public Stack<Integer> st;

    public MinStack() {
        st=new Stack<Integer>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp=new Stack<Integer>();
        int mini=st.peek();
        while(!st.isEmpty()){
            mini=Math.min(mini,st.peek());
            temp.push(st.pop());
        }
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }

        return mini;
    }
}
