class Solution {
    public boolean validMountainArray(int[] arr) {
		if(arr.length < 3) 
            return false;

		int i = 0;
		boolean increasing  = false;
		boolean decreasing = false;

		while(i + 1 < arr.length && arr[i+1] > arr[i]) {
			increasing = true;
			i++;
		}

		while(i + 1 < arr.length && arr[i+1] < arr[i]) {
			decreasing = true;
			i++;
		}

		return increasing == true && decreasing == true 
            && i == arr.length-1;
    }
}