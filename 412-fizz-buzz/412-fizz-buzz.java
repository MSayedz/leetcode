class Solution {
    final static String FIZZ = "Fizz";
    final static String BUZZ = "Buzz";
    final static String FIZZ_BUZZ = "FizzBuzz";
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for(int i = 1; i<= n; i++)
            if(i % 15 == 0)
               result.add(FIZZ_BUZZ);
            else if(i % 5 == 0)
               result.add(BUZZ);
            else if(i % 3 == 0)
               result.add(FIZZ);
            else
               result.add(String.valueOf(i));
        
        return result;
    }
}