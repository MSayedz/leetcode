class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        
        while(low < high){
            mid = (low + high)/2;
            
            if(arr[mid+1] > arr[mid]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        
        return low;
    }
}