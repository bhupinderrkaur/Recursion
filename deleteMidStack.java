class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        if(s.isEmpty())
        return;
        int k=sizeOfStack/2 + 1;
        solve(s,k);
    } 
    public void solve(Stack<Integer>s,int k){
        if(k==1){ 
            s.pop();
            return;
        }
        int t=s.peek();
        s.pop();
        solve(s,k-1);
        s.push(t);     
    }
}

