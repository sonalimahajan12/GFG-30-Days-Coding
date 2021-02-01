public class Solution {
    public int solve(int[][] A, int B) {
        
        int row=A.length;
        int col=A[0].length;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                //B==3
                if(i+B<=row && j+B<=col)
                {
                    int sum=0;
                for(int k=i;k<i+B;k++)
                {
                    for(int l=j;l<j+B;l++)
                        sum+=A[k][l];
                }
                maxsum=Math.max(maxsum,sum);
                }
            }
        }
        return maxsum;
    }
}
