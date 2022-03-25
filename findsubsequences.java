
class Solution
private static void findsubsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
 
       
        findsubsequences(s.substring(1), ans + s.charAt(0));
 
        findsubsequences(s.substring(1), ans);
    }
}
