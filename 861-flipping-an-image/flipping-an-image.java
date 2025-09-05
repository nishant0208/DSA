class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] flip = new int [image.length][image[0].length];
        int c = 0;
        for(int i = 0 ; i<image.length; i++)
        {
            for(int j = image[i].length-1; j >= 0; j--)
            {
                if(image[i][j]==1)
                flip[i][c] = 0; 
                
                else flip [i][c] = 1;

                c++;
            }
            c = 0;
        }
        return flip;
    }
}