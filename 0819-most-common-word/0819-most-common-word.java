class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> wordsCount = new HashMap<>();
        Set<String> bannedWords 
            = Arrays.stream(banned).collect(Collectors.toSet());
        String resultWord = "";
        int maxCount = 0;
        String[] allWords = paragraph.split("\\W+");
        
        for(String currentWord: allWords){
            currentWord = currentWord.toLowerCase();
            if(!bannedWords.contains(currentWord)){
                int currentCount = 
                    wordsCount.getOrDefault(currentWord,0)+1;
                
                wordsCount.put(currentWord, currentCount);
                if(currentCount > maxCount){
                    maxCount = currentCount;
                    resultWord = currentWord;
                }
            }
        }
        return resultWord;
    }
}