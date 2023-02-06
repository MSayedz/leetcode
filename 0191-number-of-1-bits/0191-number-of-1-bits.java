public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++)
            count+=(n>>i&1);
        
        return count;
        // return (int) Integer.toBinaryString(n)
        //     .chars().filter(ch -> ch == '1').count();
    }
}