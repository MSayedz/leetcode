class Solution {
    public double average(int[] salary) {
        // Arrays.sort(salary);
        // double sum = 0d;
        // for(int i=1;i<salary.length-1;i++){
        //     sum +=salary[i];
        // }        
        // return sum/(salary.length-2);
        
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