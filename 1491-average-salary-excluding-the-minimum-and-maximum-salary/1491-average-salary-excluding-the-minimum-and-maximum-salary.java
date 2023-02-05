class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        for(int i=0;i<salary.length;i++){
            sum +=salary[i];
        }
        if(salary.length<2)
            return sum;
        
        else if(salary.length == 2)
            return sum/2;
        
        sum-=salary[0];
        sum-=salary[salary.length-1];
        return sum/(salary.length-2);
    }
}