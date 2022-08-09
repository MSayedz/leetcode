class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int max = arr[length - 1];
        int j = length - 2;
        
        while(j >= 0) {
            int temp = arr[j];
            arr[j--] = max;
            max = Math.max(max, temp);
        }
        
        arr[length - 1] = -1;
        return arr;
    }
}