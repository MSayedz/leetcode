class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int res=0,len=arr.length;
       for(int i=0;i<arr.length;i++){
           int end=i+1;
           int start=len-i;
           int total=start*end;
           int odd=total/2;
           if(total%2==1)
               odd++;
           res+=odd*arr[i];
        }
        return res;
        
        // int sum = 0;
        // for(int i=0; i<arr.length; i++) 
        //     for(int j=i; j<arr.length; j++) 
        //         if((i+j) % 2 == 0 ) 
        //             for(int k=i; k<=j; k++) 
        //                 sum+=arr[k]; 
        // return sum;
    }
}