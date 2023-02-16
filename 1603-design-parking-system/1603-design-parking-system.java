class ParkingSystem {
    int[] availableSpaces = new int[3];
    
    public ParkingSystem(int big, int medium, int small) {
        availableSpaces[0] = small;
        availableSpaces[1] = medium;
        availableSpaces[2] = big;
    }
    
    public boolean addCar(int carType) {
        if(carType == 3){
            return availableSpaces[0]-- > 0;
        } else if(carType == 2){
            return availableSpaces[1]-- > 0;
        }
        return availableSpaces[2]-- > 0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */