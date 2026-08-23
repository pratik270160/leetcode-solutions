class Solution {
    public boolean isPalindrome(String s) {
        boolean condition=false;
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        if(s.equals(rev))
        {
            condition=true;
        }
        else
        condition=false;
        return condition;
    }
}