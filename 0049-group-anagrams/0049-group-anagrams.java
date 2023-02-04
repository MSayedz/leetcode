class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<String> srtList;
        char[] ca;
        
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            srtList = map.getOrDefault(sortedStr, 
                                       new ArrayList<>());
            srtList.add(str);
            map.put(sortedStr,srtList);
        }
        
        return map.values().stream().collect(Collectors.toList());
        
//         if (strs == null || strs.length == 0) 
//             return new ArrayList<>();
//         Map<String, List<String>> map = new HashMap<>();
//         char[] ca;
        
//         for (String s : strs) {
//             ca = new char[26];
//             char[] charArray = s.toCharArray();
            
//             for (char c : charArray){
//                 ca[c - 'a']++;
//             }
            
//             String keyStr = String.valueOf(ca);
            
//             if (!map.containsKey(keyStr)) {
//                 map.put(keyStr, new ArrayList<>());
//             }
            
//             map.get(keyStr).add(s);
//         }
//         return new ArrayList<>(map.values());
    }
}
