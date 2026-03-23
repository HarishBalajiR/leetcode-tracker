// Last updated: 3/23/2026, 5:28:29 PM
/*
 * Same approach as Java but clean code.
 * Refer Java Notes.
*/

1class Solution {
2public:
3    bool isValid(string s) {
4        stack<char> st;
5        for(char ch : s){
6            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
7            else{
8                if(ch==')'){
9                    if(!st.empty() && st.top()=='(') st.pop();
10                    else return false;
11                }
12                if(ch==']'){
13                    if(!st.empty() && st.top()=='[') st.pop();
14                    else return false;
15                }
16                if(ch=='}'){
17                    if(!st.empty() && st.top()=='{') st.pop();
18                    else return false;
19                }
20            }
21        }
22        return st.empty();
23    }
24};