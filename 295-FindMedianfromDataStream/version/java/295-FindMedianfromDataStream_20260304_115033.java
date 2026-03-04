// Last updated: 3/4/2026, 11:50:33 AM
/*
 * Min Heap, Max Heap Basics.
 * How to add -> heap.add()
 * how to remove -> heap.remove()
 * how to check -> heap.peek()
 * how to access top -> heap.poll()
*/

1class MedianFinder {
2    PriorityQueue<Integer> minheap = new PriorityQueue<>();
3    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
4    public MedianFinder() {
5        
6    }
7    
8    public void addNum(int num) {
9        minheap.add(num);
10        if(minheap.size() > maxheap.size() + 1) maxheap.add(minheap.poll());
11        if(!maxheap.isEmpty() && maxheap.peek() >= minheap.peek()){
12            int temp = maxheap.poll();
13            maxheap.add(minheap.poll());
14            minheap.add(temp);
15        }
16    }
17    
18    public double findMedian() {
19        if(minheap.size() == maxheap.size()) return (minheap.peek() + maxheap.peek())/2.0; 
20        if(minheap.size() > maxheap.size()) return minheap.peek()/1.0;
21        return maxheap.peek()/1.0;
22    }
23}
24
25/**
26 * Your MedianFinder object will be instantiated and called as such:
27 * MedianFinder obj = new MedianFinder();
28 * obj.addNum(num);
29 * double param_2 = obj.findMedian();
30 */