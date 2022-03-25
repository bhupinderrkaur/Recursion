class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> res = new ArrayList<>();
        String valid = "";
        int open,close;
        open = close = n;
        
        generate(res,valid,open,close);
        
        return res;
    }
    
    void generate(List<String> res,String valid,int open,int close)
    {
        if(open == 0 && close == 0)
        {
            res.add(valid);
            return;
        }
        
        if(open!=0)
        {
            String op=valid;
            op=op+"(";
            generate(res,op,open-1,close);
        }
        
        if(close>open)
        {
            String op=valid;
            op=op+")";
            generate(res,op,open,close-1);
 
        }
    }
}
