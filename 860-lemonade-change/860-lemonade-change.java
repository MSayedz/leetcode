class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change =  new int[2];
        
        for(int bill:bills){
            if(bill == 5)
                ++change[0];
            else if(bill == 10){
                ++change[1];
                if(change[0] == 0)
                    return false;
                --change[0];
            } else if(bill == 20){
                if(change[0] == 0)
                    return false;
                if(change[1] == 0 && change[0] < 3)
                    return false;
                --change[0];
                if(change[1] != 0)
                    --change[1];
                else
                    change[0] -=2;
            }
        }
        return true;
    }
}