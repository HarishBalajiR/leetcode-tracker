// Last updated: 3/4/2026, 6:55:59 PM
// Same approach as Java but much cleaner and readable.
1class Solution {
2private:
3    string reverse_toggle(string result){
4        for(int index = 0 ; index < result.size() ; index++){
5            if(result[index]=='1') result[index]='0';
6            else result[index]='1';
7        }
8        reverse(result.begin(),result.end());
9        return "1"+result;
10    }
11public:
12    char findKthBit(int n, int k) {
13        string res = "0";
14        for(int i = 1 ; i < n ; i++){
15            res+=reverse_toggle(res);
16        }
17        cout << res << endl;
18        return res[k-1];
19    }
20};
21
22// s1 = 0
23// s2 = 0 + 1 + rev(toggle(0)) -> 0 + 1 + rev(1) -> 011
24// s3 = 011 + 1 + rev(toggle(011)) -> 011 + 1 + rev(100) -> 0111001