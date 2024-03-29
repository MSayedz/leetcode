class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1;
        while(i<j){
            if(numbers[i] + numbers[j] == target && i!=j){
                return new int[] {++i,++j};
            } else if(numbers[i] + numbers[j] > target)
                j--;
            else
                i++;
        }
        
        return new int[2];
    }
}