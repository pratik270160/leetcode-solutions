class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int x=0;
        int largest=0;
        int sum=0;
        for(int i=0;i<candies.length;i++)
        {
            x=candies[i];
            if(x>largest)
            {
                largest=x;
            }
        }
        List<Boolean>result=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            sum=candies[i]+extraCandies;
            if(sum>=largest)
            {
                result.add(true);
            }
            else
            result.add(false);
        }
        return result;
    }
}