class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        List<String> srtList;
        
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            srtList = map.getOrDefault(sortedStr, 
                                       new ArrayList<>());
            srtList.add(str);
            map.put(sortedStr,srtList);
        }
        
        return map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }
}