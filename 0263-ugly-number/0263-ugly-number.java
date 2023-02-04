class Solution {
    public boolean isUgly(int n) {
        for (int i=2; i<6 && n>0; i++)
            while (n % i == 0)
                n /= i;
        return n == 1;
        // while (n > 1) {
        //     if (n % 2 == 0) 
        //         n /= 2;
        //     else if (n % 3 == 0) 
        //         n /= 3;
        //     else if (n % 5 == 0) 
        //         n /= 5;
        //     else 
        //         return false;
        // }
        // return n > 0;
    }
}