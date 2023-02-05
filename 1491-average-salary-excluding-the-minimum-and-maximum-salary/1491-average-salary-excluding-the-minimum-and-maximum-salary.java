class Solution {
    public double average(int[] salary) {
//         Arrays.sort(salary);
//         double sum = 0d;
//         for(int i=0;i<salary.length;i++){
//             sum +=salary[i];
//         }
//         if(salary.length<2)
//             return sum;
        
//         else if(salary.length == 2)
//             return sum/2;
        
//         sum-=salary[0];
//         sum-=salary[salary.length-1];
//         return sum/(salary.length-2);
        
        double sum = 0d;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int cur : salary) {
            min = Math.min(min, cur);
            max = Math.max(max, cur);
            sum += cur;
        }
        
        return (sum - min - max) / (salary.length - 2);
    }
}