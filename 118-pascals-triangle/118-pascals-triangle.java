class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return result;
        }
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        List<Integer> row; 
        for(int i=1;i<=numRows-1;i++){
            row = new ArrayList<Integer>();
            row.add(1);
            for(int k=1; k<i;k++)
                row.add((result.get(i-1).get(k-1) + result.get(i-1).get(k)));                   
            row.add(1);
            result.add(row);
        }        
        return result;
    }
}