class Solution {
    public int findNumbers(int[] nums) {
        /*
            int count = 0;
            for (int num : nums) 
                if ((num > 9 && num < 100) 
                    || (num > 999 && num < 10000)) 
                    count++;
            return count;
        */
        int res =0;
        for(int num:nums){
            int n=0;
            while(num>0){
                num/=10;
                n++;
            }
            if(n%2 ==0)
                res++;
        }
        return res;
    }
}