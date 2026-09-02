class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int count =0;
        while(i<k)
        {
          char ch=s.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          {
            count++;
          }
          i++;
        }
         int maxcount=count;
        for(int j=k;j<s.length();j++)
        {
            char newch=s.charAt(j);
            if(newch=='a'|| newch=='e'|| newch=='i'|| newch=='o'|| newch=='u')
            {
                count++;
            }
            char oldch=s.charAt(j-k);
            if(oldch=='a'|| oldch=='e'|| oldch=='i'|| oldch=='o'|| oldch=='u')
            {
                count--;
            }
             maxcount=Math.max(maxcount,count);
        }
        return maxcount;
        
    }
}