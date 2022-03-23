class Sort{
public void sortedInsert(Stack<Integer> s, int x){
        if(s.isEmpty() || x > s.peek()){
            s.push(x);
            return;
        }

        int temp = s.pop();
        sortedInsert(s,x);

        s.push(temp);
    }

    public Stack<Integer> sort(Stack<Integer> s)
    {
       
        if (!s.isEmpty()){
            int x = s.pop();
            sort(s);
            sortedInsert(s,x);
            return s;
        }else{
            return null;
        }
    }
}
