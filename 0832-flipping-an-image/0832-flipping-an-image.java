class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image[0].length; i++){
            reverse(image[i]);
        }
        return image;
    }

    public void reverse(int[] image){
        int start = 0;
        int end = image.length - 1;
        
        while(start<=end){            
            int temp = image[start];
            image[start++] = invert(image[end]);
            image[end--] = invert(temp);
        }
    }
    
    public int invert(int i){
        return i == 0 ? 1 :0;
    }
    
    /*
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
    */
}