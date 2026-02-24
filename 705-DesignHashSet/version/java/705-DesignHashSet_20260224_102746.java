// Last updated: 2/24/2026, 10:27:46 AM
/*
 * How to design a HashSet? 
 * Declare int[] or boolean[]
 * Add key as 1 (true) 
 * Remove key as 1 (false)
 * Check key if 1 -> true else false
*/

1class MyHashSet {
2    int[] s = new int[1000001];
3    public MyHashSet() {
4    }
5    
6    public void add(int key) {
7        s[key] = 1;
8    }
9    
10    public void remove(int key) {
11        s[key] = 0;
12    }
13    
14    public boolean contains(int key) {
15        return s[key]==1 ? true : false;
16    }
17}
18
19/**
20 * Your MyHashSet object will be instantiated and called as such:
21 * MyHashSet obj = new MyHashSet();
22 * obj.add(key);
23 * obj.remove(key);
24 * boolean param_3 = obj.contains(key);
25 */