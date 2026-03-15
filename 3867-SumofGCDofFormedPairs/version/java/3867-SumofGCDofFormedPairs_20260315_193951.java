// Last updated: 3/15/2026, 7:39:51 PM
// Same approach as C++> > > Refer C++ NOtes
1class Solution {
2    public int gcd(int a, int b) {
3        if (b==0) return a;
4        return gcd(b,a%b);
5    }
6   
7    public long gcdSum(int[] nums) {
8        long sum = 0;
9        int n = nums.length;
10        int[] prefixGcd = new int[n];
11        prefixGcd[0] = nums[0];
12        int runnmax = nums[0];
13        for(int i = 1 ; i < n ; i++){
14            runnmax = Math.max(runnmax,nums[i]);
15            prefixGcd[i] = gcd(nums[i],runnmax);
16        }
17        Arrays.sort(prefixGcd);
18        int left = 0, right = n-1;
19        while(left < right){
20            sum+=gcd(prefixGcd[left],prefixGcd[right]);
21            left++;
22            right--;
23        }
24        return sum;
25    }
26}