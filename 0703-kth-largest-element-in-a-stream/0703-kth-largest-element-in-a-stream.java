class KthLargest {

    PriorityQueue<Integer> heap;
    int k;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<Integer>();
        this.k = k;
        
        for(int num:nums)
            heap.offer(num);
        
        while(heap.size() > k)
            heap.poll();
    }
    
    public int add(int val) {
        heap.offer(val);
        
        while(heap.size()>k)
            heap.poll();
        
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */