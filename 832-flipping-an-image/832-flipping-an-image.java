class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i<A[0].length; i++){
            reverse(A[i]);
        }
        return A;
    }

    public void reverse(int[] A){
        int start = 0;
        int end = A.length - 1;
        while(start<=end){
            int temp = A[start];
            A[start] = invert(A[end]);
            A[end] =invert(temp);
            start++;
            end--;
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