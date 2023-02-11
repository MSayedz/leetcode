class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] != newColor)
            floodFill(image, sr, sc,image[sr][sc], newColor);
        return image;
    }
    
    
    public void floodFill(int[][] image, int sr, int sc,int oldColor, int newColor){
        if(sr <image.length && sr >= 0 
           && sc <image[0].length && sc >= 0 
           && image[sr][sc] == oldColor){
            image[sr][sc] = newColor;
            floodFill(image, sr+1, sc, oldColor, newColor);
            floodFill(image, sr-1, sc, oldColor, newColor);
            floodFill(image, sr, sc+1, oldColor, newColor);
            floodFill(image, sr, sc-1, oldColor, newColor);
        }
        return;
    }
}