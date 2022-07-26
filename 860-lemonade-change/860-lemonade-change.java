class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        
        for(int bill:bills){
            if(bill == 5){
                ++five;
            } else if(bill == 10){
                ++ten;
                if(five == 0){return false;}
                --five;
            } else {
                if(five == 0){return false;}
                if(ten == 0 && five < 3){return false;}
                if(ten != 0){--ten;--five;}
                else{five -=3;}
            }
        }
        return true;
    }
}