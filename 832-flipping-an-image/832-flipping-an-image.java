class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rowSize = image[0].length;
        for(int i=0;i<image.length;i++){
            for(int j=0;j<rowSize/2;j++){
                int temp = image[i][j];
                image[i][j] = image[i][rowSize-j-1];
                image[i][rowSize-j-1] = temp;
            }
        }
        
        for(int i=0;i<image.length;i++){
            for(int j=0;j<rowSize;j++){
                image[i][j] = image[i][j]==0?1:0;
            }
        }
        return image;
    }
}