class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current;
        for(int i=0; i< nums.length -2; i++)
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int r = i+1; int l = nums.length-1;
                while(r<=l){
                    if(nums[i] + nums[r] + nums[l] == 0 && r != l){
                        current = new ArrayList<Integer>();
                        current.add(nums[i]);
                        current.add(nums[r]);
                        current.add(nums[l]);
                        result.add(current);
                        while(r<l && nums[r] == nums[r+1]) r++;
                        while(r<l && nums[l] == nums[l-1]) l--;
                        r++; l--;
                    } else if(nums[i] + nums[r] + nums[l] < 0){
                        r++;
                    } else{
                        l--;
                    }
                }
            } 
        return result;
    }
}