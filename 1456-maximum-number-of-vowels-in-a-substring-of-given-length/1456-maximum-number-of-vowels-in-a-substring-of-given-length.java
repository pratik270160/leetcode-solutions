class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int left=0;
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
               char vowel=s.charAt(i);
               count++;
            }
        }
        max=count;
        for(int right=k;right<s.length();right++)
        {
            if(s.charAt(right)=='a' || s.charAt(right)=='e'|| s.charAt(right)=='i' || s.charAt(right)=='o' || s.charAt(right)=='u')
            {
                count++;
            }
            if(s.charAt(left)=='a' || s.charAt(left)=='e'|| s.charAt(left)=='i' || s.charAt(left)=='o' || s.charAt(left)=='u')
            {
                count--;
            }
            left++;
            max=Math.max(count,max);
        }
        return max;
    }
}