class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        //matrix transpose 
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                swap(matrix,i,j);
            }
        }
        
        //reverse every row 
        for(int i=0;i<n;i++)
        {
            int l = 0;
            int r = n - 1;
            while (l < r)
            {
                swapROw(matrix, i, l, r);
                l++;
                r--;
            }
        }
    }

    public void swap (int [][] matrix,int i,int j)
    {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }

    public void swapROw (int [][] matrix,int i,int l,int r)
    {
        int temp=matrix[i][l];
        matrix[i][l]=matrix[i][r];
        matrix[i][r]=temp;
    }
    
}