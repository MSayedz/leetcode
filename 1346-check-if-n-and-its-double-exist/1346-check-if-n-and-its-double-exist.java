class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> doubles  = new HashSet<>();
        for(int c :arr){
            if(doubles.contains(c*2) 
               || (c%2 ==0 && doubles.contains(c/2)) )
                    return true;
            doubles.add(c);
        }
            
        return false;
    }
}