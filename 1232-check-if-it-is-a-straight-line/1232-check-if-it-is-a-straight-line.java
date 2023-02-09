class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length < 3)
            return true;
        int diffX = coordinates[1][0] - coordinates[0][0];
        int diffY = coordinates[1][1] - coordinates[0][1];
        
        for (int[] coordinate : coordinates)
            if(diffY*(coordinate[0] - coordinates[1][0])
              != diffX*(coordinate[1] - coordinates[1][1]))
                return false;
        
        return true;
    }
}