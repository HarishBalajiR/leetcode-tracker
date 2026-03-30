// Last updated: 3/30/2026, 8:44:36 AM
class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for(char ch : s){
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(ch==')'){
                    if(!st.empty() && st.top()=='(') st.pop();
                    else return false;
                }
                if(ch==']'){
                    if(!st.empty() && st.top()=='[') st.pop();
                    else return false;
                }
                if(ch=='}'){
                    if(!st.empty() && st.top()=='{') st.pop();
                    else return false;
                }
            }
        }
        return st.empty();
    }
};