class Solution {
    public void rotate(int[][] matrix) {
        int temp=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            //reversing the rows
            int right=matrix.length-1;
            int left=0;
            int temp1=0;
            while(left<right)
            {
                temp1=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp1;
                left++;
                right--;
            }
        }
    }
}