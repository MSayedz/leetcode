class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        ArrayList<Integer> bfs = new ArrayList();
        int[] degree = new int[numCourses];
        
        for (int i=0;i<numCourses;i++) {
            map.put(i, new ArrayList<Integer>());
        }
        for (int[] e : prerequisites) {
            List<Integer> cources = map.get(e[1]);
            cources.add(e[0]);
            map.put(e[1], cources);
            degree[e[0]]++;
        }
        for (int i=0;i<numCourses;i++) {
            if (degree[i] == 0) {
                bfs.add(i);
            }
        }
        for (int i=0;i<bfs.size();i++){
            for (int j: map.get(bfs.get(i))){
                if (--degree[j] == 0){
                    bfs.add(j);
                }
            }
        }
        return bfs.size() == numCourses;
    }
}