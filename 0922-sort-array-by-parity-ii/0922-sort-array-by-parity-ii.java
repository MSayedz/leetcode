class Solution {
    public int[] sortArrayByParityII(int[] A) {
//         int[] res = new int[A.length];
//         int oddIndex = 1;
//         int evenIndex = 0;
        
//         for(int n: A){
//             if(n%2 == 0){
//                 res[evenIndex] = n;
//                 evenIndex+=2;
//             } else {
//                 res[oddIndex] = n;
//                 oddIndex+=2;
//             }
//         }
        
//         return res;
        
        int j = 1;
        for (int i = 0; i < A.length; i += 2){
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1)
                    j += 2;

                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }

        return A;
    }
}