// Last updated: 3/15/2026, 9:04:34 AM
// MATHS
1class Solution {
2public:
3    long long countCommas(long long num) {
4        string s = to_string(num);
5        int n = s.size();
6        if(n<=3) return 0;
7        else{
8            if(num < 1000000) return num - 999; // 10^6
9            else if(num < 1000000000){
10                long long c1 = num-999;// 1000 - 999999
11                long long c2 = num-999999; //199235
12                return c1+c2;//1,000,000 - 1,000,000,000
13            }// 10^9
14            else if(num < 1000000000000){
15                long long c1 = num - 999;
16                long long c2 = num - 999999;
17                long long c3 = num - 999999999;
18                return c1+c2+c3;
19            }//10^12
20            else if(num < 1000000000000000){
21                long long c1 = num - 999;
22                long long c2 = num - 999999;
23                long long c3 = num - 999999999;
24                long long c4 = num - 999999999999;
25                return c1+c2+c3+c4;
26            }//10^15
27            else{
28                long long c1 = num - 999;
29                long long c2 = num - 999999;
30                long long c3 = num - 999999999;
31                long long c4 = num - 999999999999;
32                long long c5 = num - 999999999999999;
33                return c1+c2+c3+c4+c5;
34            }//1e15
35        }
36        return 0;
37    }
38};
39